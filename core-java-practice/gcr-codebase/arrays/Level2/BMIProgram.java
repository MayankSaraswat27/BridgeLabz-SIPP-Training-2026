import java.util.Scanner;

public class BMIProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for(int i = 0; i < n; i++) {
            weight[i] = sc.nextDouble();
            height[i] = sc.nextDouble();

            if(weight[i] <= 0 || height[i] <= 0) {
                System.out.println("Invalid Input");
                i--;
            }
        }

        for(int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if(bmi[i] <= 18.4)
                status[i] = "Underweight";
            else if(bmi[i] <= 24.9)
                status[i] = "Normal";
            else if(bmi[i] <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        for(int i = 0; i < n; i++) {
            System.out.println("Height: " + height[i] +
                    " Weight: " + weight[i] +
                    " BMI: " + bmi[i] +
                    " Status: " + status[i]);
        }
    }
}