import java.util.Scanner;
public class pr2 {

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
    
        String a="abcdefghijklmnopqrstuvwxyz";
    
        String [] m={".....", "....-", "...-.", "...--", "..-..", "..-.-", "..--.", ".-...", ".-..-", ".-.-.", ".-.--", ".--..", ".--.-", "-....", "-...-", "-..-.", "-..--", "-.-..", "-.-.-", "-.--.", "-.---", "--...", "--..-", "--.-.", "--.--", "-----"};
    
        System.out.print("Enter String :");

        String c=s.next();
        for(int  i=0;i<c.length();i++){
            for(int j=0;j<a.length();j++){
                if(c.charAt(i)==a.charAt(j)){
                    System.out.print(m[j]);
                }
            }
        }
    }
}