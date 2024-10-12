import java.util.Scanner;

public class pr4 {
    public static void main(String [] args){
        Scanner s= new Scanner(System.in);
        int a;
        int [] n=new int[4];
        String [] pro={"Motor","Fan","Tube","Light"};
        double [] p =new double[4];
        double [] g = new double[4];
        do { 
            int i=0;
            System.out.println(":::::Menu::::::::");
            System.out.println("1.Motor");
            System.out.println("2.Fan");
            System.out.println("3.Tube");
            System.out.println("4.Wire");
            System.out.println("5.exit");
            System.out.print("Enter Choice :");
            a = s.nextInt();
            

            switch(a){
                case 1:
                {
                    System.out.print("Enter Price of Motor :");
                    p[0]+=s.nextDouble();
                    g[0]=8;
                    n[0]++;
                    break;
                }
                case 2:
                {
                    System.out.print("Enter Price of Fan :");
                    p[1]+=s.nextDouble();
                    g[1]=12;
                    n[1]++;
                    break; 
                }
                case 3:
                {
                    System.out.print("Enter Price of Tube :");
                    p[2]+=s.nextDouble();
                    g[2]=5;
                    n[2]++;
                    break;                     
                }
                case 4:{
                    System.out.print("Enter Price of Light :");
                    p[3]+=s.nextDouble();
                    g[3]=7.5;
                    n[3]++;
                    break;
                }
               
            }
        } while (a!=5);
        System.out.println("----Bill-----");
        double bill=0;
        for(int i=0;i<n.length;i++){
            if(n[i]!=0){
                System.out.println("Product Name :"+pro[i]);
                System.out.println("Product price : "+(p[i]/n[i]));
                System.out.println("GST :"+g[i]+"%");
                double tp=p[i]+(p[i]*g[i])/100;
                System.out.println("Total Price : "+tp+"\n\n");
                bill+=tp;

            }
        }
        System.out.println("Total Bill: "+bill);
    }
}
