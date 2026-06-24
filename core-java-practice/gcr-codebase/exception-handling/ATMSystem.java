import java.util.Scanner;

class InsufficientBalanceException extends Exception {

    private double balance;
    private double withdrawalAmount;

    public InsufficientBalanceException(
            String message,
            double balance,
            double withdrawalAmount) {

        super(message);
        this.balance = balance;
        this.withdrawalAmount = withdrawalAmount;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawalAmount() {
        return withdrawalAmount;
    }
}

public class ATMSystem {

    static void withdraw(
            double balance,
            double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {

            throw new InsufficientBalanceException(
                    "Insufficient Balance",
                    balance,
                    amount);
        }

        System.out.println(
                "Withdrawal Successful");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        try {

            withdraw(balance, amount);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());
            System.out.println(
                    "Available Balance = ₹" +
                    e.getBalance());

            System.out.println(
                    "Requested Amount = ₹" +
                    e.getWithdrawalAmount());
        }
    }
}