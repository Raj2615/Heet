import java.util.Scanner;

public class pr7{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n;
        System.out.print("Enter Length of Array :");
        n = s.nextInt();

        int [] a =new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        System.out.print("Enter Element to be count :");
        int tar = s.nextInt();
        int c=0;
        for (int i = 0; i < n; i++) {
            if(a[i]==tar){
                c++;
            }
        }
        System.out.println(tar+" is "+c+" time in this array.");
    }
}
