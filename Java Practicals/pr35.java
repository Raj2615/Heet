class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + " is running with priority " + getPriority());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
public class pr35 {
    public static void main(String[] args) {
        PriorityThread first = new PriorityThread("FIRST");
        PriorityThread second = new PriorityThread("SECOND");
        PriorityThread third = new PriorityThread("THIRD");

        first.setPriority(3);
        // second priority remains default (5)
        third.setPriority(7);

        first.start();
        second.start();
        third.start();
    }
}
