import java.util.Scanner;
public class pr6 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String :");
        String a = s.next();
        System.out.print("Enter Repeat time :");
        int n=s.nextInt();

        if(n>a.length()){
            for(int i=0;i<n;i++){
                System.err.print(a+" ");
            }
        }
        else{
            for(int i=0;i<n;i++){
                System.err.print(a.substring(0,3)+" ");
            }
        }
    }
}
