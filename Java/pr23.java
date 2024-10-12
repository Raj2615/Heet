
import java.util.Scanner;

public class pr23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x,y;

        System.out.print("Enter x:");
        x=s.nextInt();
        System.out.print("Enter y:");
        y=s.nextInt();

        try {
            int z=x/y;
            System.out.println(z);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        s.close();
    }
}
