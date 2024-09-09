
import java.util.Scanner;

class area{
    int a;
    area(int l,int b){
        a=l*b;
    }
    public void returnarea() {
        System.out.println("Area of Rectangle is :" +a);
    }
}
public class pr14 
{    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Length of Rectangle :");
        int l = s.nextInt();
        System.out.print("Enter Breadth of Rectangle :");
        int b = s.nextInt();

        area a=new area(l,b);
        a.returnarea();
    }
}
