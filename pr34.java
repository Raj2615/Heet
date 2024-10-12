class IncrementingThread extends Thread {
    private int value = 0;

    @Override
    public void run() {
        while (true) {
            value++;
            System.out.println("Current value: " + value);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

public class pr34 {
    public static void main(String[] args) {
        new IncrementingThread().start();
    }
}
