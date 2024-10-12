public class pr24 {
    public static void main(String[] args) {
        try {
            int result = divideByZero();
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("This block always executes, regardless of whether an exception occurred.");
        }
    }
    public static int divideByZero() {
        return 10 / 0; 
    }
}
