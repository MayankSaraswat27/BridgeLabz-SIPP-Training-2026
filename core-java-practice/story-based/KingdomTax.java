import java.util.Scanner;

public class KingdomTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] incomes = new double[10];
        double totalTaxCollected = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter income of citizen " + (i + 1) + ": ");
            incomes[i] = sc.nextDouble();

            double tax;
            String bracket;

            if (incomes[i] < 10000) {
                tax = incomes[i] * 0.05;
                bracket = "5% Tax Bracket";
            } 
            else if (incomes[i] <= 50000) {
                tax = incomes[i] * 0.15;
                bracket = "15% Tax Bracket";
            } 
            else {
                tax = incomes[i] * 0.30;
                bracket = "30% Tax Bracket";
            }

            System.out.println("Citizen " + (i + 1));
            System.out.println("Income : " + incomes[i]);
            System.out.println("Bracket: " + bracket);
            System.out.println("Tax    : " + tax);
            System.out.println();

            totalTaxCollected += tax;
        }
        System.out.println("Total Tax Collected = " + totalTaxCollected);

        sc.close();
    }
}