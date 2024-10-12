
import java.util.Arrays;
import java.util.Scanner;

public class pr9 {  
    public static void len(String a) {
    try {
        int c = 0;
        for (int i = 0; i < a.length(); i++) {
            c++;
        }
        System.out.println("Length of String is : " + c);
       
    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
        
    }
}

    public static void upper(String a){
        String s="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>'a'&& a.charAt(i)<'z'){
                s+=(char)(a.charAt(i)-32);
            }
            else{
                s+=a.charAt(i);
            }
        }
    }
    public static void lower(String a){
        String s="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>'A' && a.charAt(i)<'Z'){
                s+=(char)(a.charAt(i)+32);
            }
            else{
                s+=a.charAt(i);
            }
        }
    }
    public static void rev(String a){
        String s="";
        for(int i=a.length()-1;i>=0;i--){
            s+=a.charAt(i);
        }
    }
    public static void sort(String a){
        char t;

        char [] s=a.toCharArray();
        Arrays.sort(s);

        String b=new String(s);


        System.out.println("Sorted String is :"+b);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String:");
        String a=s.next();
        int n;
            System.out.println("1.Find Length of String.");
            System.out.println("2.Convert to Uppercase.");
            System.out.println("3.Convert to Lowercase.");
            System.out.println("4.Reverse ");
            System.out.println("5.Sort");
            System.out.println("6.Exit");
            System.out.println("Enter Choice :");
            n = s.nextInt();
                switch(n){
                    case 1:{

                        len(a);
                    }
               case 2:
                {
                    upper(a);
                    break;
                }
                case 3:
                {
                    lower(a);
                    break;
                }
                case 4:
                {
                    rev(a);
                    break;
                }
                case 5:
                {
                    sort(a);
                        break;
                }
                case 6:
                {
                        break;
                }
            }
        }
    }
