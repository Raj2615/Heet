import java.util.concurrent.atomic.AtomicLong;

class SumThread extends Thread {
    private final int start;
    private final int end;
    private final AtomicLong result;

    public SumThread(int start, int end, AtomicLong result) {
        this.start = start;
        this.end = end;
        this.result = result;
    }

    @Override
    public void run() {
        long sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        result.addAndGet(sum);
    }
}
public class pr32 {
    public static void main(String[] args) throws InterruptedException {
        if (args.length != 2) {
            System.out.println("Usage: java MultiThreadedSum <N> <numThreads>");
            return;
        }

        int N = Integer.parseInt(args[0]);
        int numThreads = Integer.parseInt(args[1]);

        AtomicLong totalSum = new AtomicLong(0);
        Thread[] threads = new Thread[numThreads];

        int numbersPerThread = N / numThreads;
        int remainingNumbers = N % numThreads;

        int start = 1;
        for (int i = 0; i < numThreads; i++) {
            int end = start + numbersPerThread - 1;
            if (i == numThreads - 1) {
                end += remainingNumbers;
            }
            threads[i] = new SumThread(start, end, totalSum);
            threads[i].start();
            start = end + 1;
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Sum of numbers from 1 to " + N + " is: " + totalSum.get());
    }
}
