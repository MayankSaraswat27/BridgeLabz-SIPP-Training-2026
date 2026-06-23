class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    public static void makePayment(double billAmount, double payment)
            throws InsufficientFundsException {

        if (payment < billAmount) {
            throw new InsufficientFundsException(
                    "Payment failed! Insufficient funds. Required: ₹"
                            + billAmount + ", Paid: ₹" + payment);
        }

        System.out.println("Payment successful. Amount Paid: ₹" + payment);
    }

    public static void main(String[] args) {

        try {
            double totalBill = 5000;
            int items = 0;

            if (items == 0) {
                throw new ArithmeticException();
            }

            double averageCost = totalBill / items;
            System.out.println("Average Cost Per Item: ₹" + averageCost);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot calculate bill. Number of items is zero.");
        }

        try {
            String[] patients = {"Rahul", "Priya", "Amit"};
            int patientIndex = 5;

            System.out.println("Patient: " + patients[patientIndex]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index entered.");
        }

        try {
            String input = "ABC123";
            int billNumber = Integer.parseInt(input);

            System.out.println("Bill Number: " + billNumber);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input. Please enter a valid number.");
        }

        try {
            double billAmount = 8000;
            double payment = 5000;

            makePayment(billAmount, payment);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Hospital Billing System executed safely without crashing.");
    }
}