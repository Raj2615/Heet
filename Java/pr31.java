// Method A: Extending Thread class
class HelloThread extends Thread {
    public void run() {
        System.out.println("Hello World from Thread class");
    }
}

// Method B: Implementing Runnable interface
class HelloRunnable implements Runnable {
    public void run() {
        System.out.println("Hello World from Runnable interface");
    }
}

public class pr31 {
    public static void main(String[] args) {
        // Using Thread class
        HelloThread thread1 = new HelloThread();
        thread1.start();

        // Using Runnable interface
        Thread thread2 = new Thread(new HelloRunnable());
        thread2.start();
    }
}
