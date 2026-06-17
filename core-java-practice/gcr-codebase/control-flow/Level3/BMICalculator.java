import java.util.*;
public class BMICalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double weight = sc.nextDouble(); // kg
        double heightCm = sc.nextDouble(); // cm

        double heightM = heightCm / 100.0;

        double bmi = weight / (heightM * heightM);

        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        System.out.println("BMI = " + bmi);
        System.out.println("Status = " + status);
    }
}
