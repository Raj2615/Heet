
import java.util.Scanner;


interface advA{
    int dsum(int n);
}

class myCal implements advA{
    public int dsum(int n){
        int s=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
            {
                s+=i;
            }
        }
        return s;
    }
}
public class pr21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Divisor::");
        int d = s.nextInt();

        myCal c = new myCal();

        int sum = c.dsum(d);

        System.out.println("Sum of Divisors for "+d+" is:::"+sum);
        s.close();
    }
}
