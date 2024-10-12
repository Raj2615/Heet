
class shape{
    void print(){
        System.out.println("This is This is shape");
    }
}
class rect extends shape{
    void print(){
        super.print();
        System.out.println("This is Rectangular Shape");
    }
}
class sq extends rect{
    void print(){
        super.print();
        System.out.println("Square is Rectnangle");
    }
}
class cir extends shape{
    void print(){
        System.out.println("This is Circular Shape");
    }
}
public class pr19 {
    public static void main(String[] args) {
        sq s = new sq();

        s.print();

    }    
}
