import java.util.Scanner;

public class BMIReport {

    static String[] calculateBMI(double weight, double heightCm) {

        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);

        String status;

        if (bmi <= 18.4)
            status = "Underweight";
        else if (bmi <= 24.9)
            status = "Normal";
        else if (bmi <= 39.9)
            status = "Overweight";
        else
            status = "Obese";

        return new String[]{
                String.valueOf(weight),
                String.valueOf(heightCm),
                String.format("%.2f", bmi),
                status
        };
    }

    static String[][] generateReport(double[][] data) {

        String[][] report = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            report[i] = calculateBMI(data[i][0], data[i][1]);
        }

        return report;
    }

    static void display(String[][] report) {

        System.out.println("Weight\tHeight\tBMI\tStatus");

        for (String[] row : report) {
            System.out.println(
                    row[0] + "\t" +
                    row[1] + "\t" +
                    row[2] + "\t" +
                    row[3]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        String[][] report = generateReport(data);

        display(report);
    }
}