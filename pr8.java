
import java.util.Scanner;

public class pr8 {
    public static void str(String s,int n){
        for(int i=0;i<s.length();i++){
            for(int j=1;j<=n;j++){
                System.out.print(s.charAt(i));
            }
            System.out.print("");
        }
    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        String a;
        System.out.println("Enter String :");
        a=n.next();
        System.out.println("Enter Number to be repeated :");
        int j=n.nextInt();
        System.out.println("Your Coustomized string is :");
        str(a,j);
    }
}
