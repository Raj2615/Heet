interface sign{
    default void get(){
        System.out.print("The background is ::");
    }
}
class rect implements sign{
    void print(){
        System.out.println("Rectangle");
    }
}
class cir implements sign{
    void print(){
        System.out.println("circle");
    }
}
class shape implements sign{
    void print(){
        System.out.println("Shape");
    }
}
public class pr22 {
    public static void main(String[] args) {
        cir a = new cir();
        a.get();
        a.print();
    }
}
