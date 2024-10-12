
import java.util.Scanner;

class rect{
    int l,b;

    public rect(int len,int bre) {
        this.l=len;
        this.b=bre;
    }
    
    void printarea(){
        int a = l*b;
        System.out.println("Area of Rectangle is:::"+a);
    }

    void printparameter(){
        int p=2*(l+b);
        System.out.println("Parameter of ractangle is:::"+p);
    }
}

class square extends rect{

    public square(int s) {
        super(s,s);
    }
    
}
public class pr18 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int l,b;
        int n;
        System.out.print("Enter Number of inputs for rectangle:::");
        n=s.nextInt();

        for(int i=0;i<n;i++){
        System.out.print("Enter Length of Ractangle:::");
        l=s.nextInt();

        System.out.print("Enter Breadth of Ractangle:::");
        b=s.nextInt();


        rect[] r=new rect[n];
            r[i]=new rect(l, b);
        r[i].printarea();
        r[i].printparameter();
        }

        System.out.print("Enter number of inputs for Square:::");
        int y= s.nextInt();

        for(int i=0;i<y;i++){
        System.out.print("Enter Length of Square:::");
        int x= s.nextInt();

        square[] sq = new square[y];
            sq[i]=new square(x);
        sq[i].printarea();
        sq[i].printparameter();
        }
        s.close();
    }
}
