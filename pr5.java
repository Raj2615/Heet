import java.util.Random;
import java.util.Scanner;
public class pr5 {
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        Random n=new Random();
        int r=n.nextInt(100)+1;
        int at=0;
        while(true){
            int a;
            System.out.print("Enter Guess Number :");
            a=s.nextInt();
            at++;
            if(r-a>=50){
                System.out.println("Too high! Try agian");
            }
            else if(r-a>=30){
                System.out.println("It's High! Try agian");
            }
            else if(r-a>=15){
                System.out.println("Tooo Close ! Try again");
            }
            else if(r==a)
            {
                System.out.println("Congratultions You win!!!!!! in "+at+"attempts");
                break;
            }
        }
    }
}
