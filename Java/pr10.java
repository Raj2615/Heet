
import java.util.Scanner;

public class pr10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String n= "CHARUSAT UNIVERSITY";

        System.out.println("Enter of "+n+" is "+n.length());
        System.out.println("Enter The First Character of your name :");
        String c = s.nextLine();
        System.out.println("Now String Replaced By "+c.charAt(0)+ " is "+n.replace('H', c.charAt(0)));
        System.out.println("Lowercase stirng is "+n.toLowerCase());
    }
}
