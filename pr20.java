class degree{
    void getd(){
        System.out.println("I got Degree");
    }
}
class underg extends degree{
    void getd(){
        System.out.println("I'm an Undergraduate");
    }
}

class postg extends degree{
    void getd(){
        System.out.println("I'm an Postgraduate");
    }
}
public class pr20 {
    public static void main(String[] args) {
        
        postg a = new postg();
        underg b = new underg(); 
        degree c = new degree();

        c.getd();
        b.getd();
        a.getd();
    }
}

