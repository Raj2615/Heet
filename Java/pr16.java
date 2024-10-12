

class pernet{
    void print(){
        System.out.println("This is perent Class");
    }
}
class child extends pernet{
    void print(){
        System.out.println("This is Child class");
    }
}
public class pr16 {
    public static void main(String[] args) {
        pernet a = new pernet();
        child b = new child();

        a.print();
        b.print();
    }
}