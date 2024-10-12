import java.util.Random;

class NumberGenerator implements Runnable {
    private final Random random = new Random();
    private final NumberProcessor evenProcessor;
    private final NumberProcessor oddProcessor;

    public NumberGenerator(NumberProcessor evenProcessor, NumberProcessor oddProcessor) {
        this.evenProcessor = evenProcessor;
        this.oddProcessor = oddProcessor;
    }

    @Override
    public void run() {
        while (true) {
            int number = random.nextInt(100);
            System.out.println("Generated: " + number);
            if (number % 2 == 0) {
                evenProcessor.process(number);
            } else {
                oddProcessor.process(number);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

class NumberProcessor implements Runnable {
    private int number;
    private boolean hasNumber = false;
    private final String name;
    private final boolean isEvenProcessor;

    public NumberProcessor(String name, boolean isEvenProcessor) {
        this.name = name;
        this.isEvenProcessor = isEvenProcessor;
    }

    public synchronized void process(int number) {
        this.number = number;
        this.hasNumber = true;
        notify();
    }

    @Override
    public void run() {
        while (true) {
            int numberToProcess;
            synchronized (this) {
                while (!hasNumber) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                numberToProcess = number;
                hasNumber = false;
            }
            if (isEvenProcessor) {
                System.out.println(name + ": Square of " + numberToProcess + " is " + (numberToProcess * numberToProcess));
            } else {
                System.out.println(name + ": Cube of " + numberToProcess + " is " + (numberToProcess * numberToProcess * numberToProcess));
            }
        }
    }
}

public class pr33 {
    public static void main(String[] args) {
        NumberProcessor evenProcessor = new NumberProcessor("Even Processor", true);
        NumberProcessor oddProcessor = new NumberProcessor("Odd Processor", false);
        NumberGenerator generator = new NumberGenerator(evenProcessor, oddProcessor);

        new Thread(generator).start();
        new Thread(evenProcessor).start();
        new Thread(oddProcessor).start();
    }
}
