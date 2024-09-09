
import java.util.Scanner;

class date{
    int d,m,y;

    public void get(){
        System.out.print("Enter Date : ");
        Scanner s = new Scanner(System.in);
        d=s.nextInt();
        System.out.print("Enter Month :");
        m = s.nextInt();
        System.out.print("Enter Year : ");
        y=s.nextInt();
        s.close();
    }
    public void set()
    {
        System.out.print("Your proper Date is : ");
        System.out.println(d+"/"+m+"/"+y);
    }

}
public class pr13 {
    public static void main(String[] args) {
        date d=new date();
        d.get();
        d.set();
    }
}
