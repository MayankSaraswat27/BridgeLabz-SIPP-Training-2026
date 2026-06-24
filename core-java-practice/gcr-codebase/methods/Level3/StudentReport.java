import java.util.Scanner;

public class StudentReport {

    static int[][] generateMarks(int students) {

        int[][] marks =
                new int[students][3];

        for(int i = 0; i < students; i++) {
            for(int j = 0; j < 3; j++) {
                marks[i][j] =
                        10 + (int)(Math.random()*90);
            }
        }

        return marks;
    }

    static double[][] calculateResults(
            int[][] marks) {

        double[][] result =
                new double[marks.length][3];

        for(int i = 0; i < marks.length; i++) {

            int total =
                    marks[i][0] +
                    marks[i][1] +
                    marks[i][2];

            double average =
                    Math.round((total/3.0)*100)/100.0;

            double percentage =
                    Math.round((total/300.0*100)*100)/100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }

    static void display(
            int[][] marks,
            double[][] result) {

        System.out.println(
                "Phy\tChem\tMath\tTotal\tAvg\t%");

        for(int i = 0; i < marks.length; i++) {

            System.out.println(
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t" +
                    marks[i][2] + "\t" +
                    result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();

        int[][] marks = generateMarks(students);

        double[][] result =
                calculateResults(marks);

        display(marks, result);
    }
}