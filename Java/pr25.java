// User-defined checked exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// User-defined unchecked exception
class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method that throws a checked exception
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Current balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }

    // Method that throws an unchecked exception
    public void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Invalid age: " + age);
        }
        System.out.println("Age set successfully: " + age);
    }
}


public class pr25 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        // Demonstrating checked exception (InsufficientFundsException)
        try {
            account.withdraw(1500); // This will throw an exception
        } catch (InsufficientFundsException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        // Demonstrating unchecked exception (InvalidAgeException)
        try {
            account.setAge(150); // This will throw an exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }

        // Demonstrating other checked and unchecked exceptions
        try {
            // Checked exception: IOException
            java.io.FileReader file = new java.io.FileReader("nonexistent.txt");
        } catch (java.io.IOException e) {
            System.out.println("Caught checked IOException: " + e.getMessage());
        }

        // Unchecked exception: ArrayIndexOutOfBoundsException
        int[] arr = new int[5];
        try {
            int value = arr[10]; // This will throw an exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught unchecked ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
