import java.util.Scanner;

public class pr3 {
    public static void main(String [] args){
        Scanner s= new Scanner(System.in);

        System.out.println("Enter Mobile Number:");
        String m=s.next();

        System.out.println("Operator code is :"+m.substring(0,2));
        System.out.println("MSC code is :"+m.substring(2,5));
        System.out.println("Operator code is :"+m.substring(5,10));
    }
}
