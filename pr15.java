
import java.util.Scanner;

class complex{
    int r,i;

    public void get(){
        System.out.print("Enter Real Part : ");
        Scanner s = new Scanner(System.in);
        r=s.nextInt();
        System.out.print("Enter Imaginary Part : ");
        i=s.nextInt();
    }
    public void sum(complex b){
        int x= r +b.r;
        int y= i +b.i;
        
        System.out.println("Your Complex Number's Sum is "+x+"+"+y+"i\n\n\n\n");
    }
    public  void diff(complex b){
        int x=r -b.r;
        int y=i -b.i;

        System.out.println("Your Complex Number's Difference is :"+x+"-"+y+"i\n\n\n\n");
    }
    public  void multi(complex b){
        int x=r *b.r;
        int y=i *b.i;

        System.out.println("Your Complex Number's Multiplication is : "+x+"*"+y+"i\n\n\n\n");
    }
}

public class pr15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        complex a = new complex();
        complex b = new complex();
        a.get();
        b.get();
        int n;
        do{
        System.out.println("1.Sum of Complex numbers");
        System.out.println("2.Difference of Complex Numbers");
        System.out.println("3.Multiplication of Complex Numbers");
        System.out.println("4.Exit");
        System.out.println("::::::::::::::::::::::::::::::::::::::");
        System.out.print("Enter Choice :");
        n=s.nextInt();

        switch(n){
            case 1:
            {
                a.sum(b);
                break;
            }
            case 2:
            {
                a.diff(b);
                break;
            }
            case 3:
            {
                a.multi(b);
                break;
            }
        }
        }while(n!=4);
    }
}
