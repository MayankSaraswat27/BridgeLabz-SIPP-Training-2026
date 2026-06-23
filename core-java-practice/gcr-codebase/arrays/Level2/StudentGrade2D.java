import java.util.Scanner;

public class StudentGrade2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
            }

            if(marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid Marks");
                i--;
            }
        }

        for(int i = 0; i < n; i++) {

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if(percentage[i] >= 80)
                grade[i] = 'A';
            else if(percentage[i] >= 70)
                grade[i] = 'B';
            else if(percentage[i] >= 60)
                grade[i] = 'C';
            else if(percentage[i] >= 50)
                grade[i] = 'D';
            else if(percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }

        for(int i = 0; i < n; i++) {
            System.out.println("Physics: " + marks[i][0] +
                    " Chemistry: " + marks[i][1] +
                    " Maths: " + marks[i][2] +
                    " Percentage: " + percentage[i] +
                    " Grade: " + grade[i]);
        }
    }
}