import java.util.Scanner;

public class StudentScoreCard {

    static int[][] generateScores(int students) {

        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 90) + 10;
            }
        }

        return scores;
    }

    static double[][] calculateResults(int[][] scores) {

        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];

            double average = Math.round((total / 3.0) * 100.0) / 100.0;

            double percentage = Math.round((total / 300.0 * 100) * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }

    static String[] calculateGrade(double[][] result) {

        String[] grades = new String[result.length];

        for (int i = 0; i < result.length; i++) {

            double percentage = result[i][2];

            if (percentage >= 80)
                grades[i] = "A";
            else if (percentage >= 70)
                grades[i] = "B";
            else if (percentage >= 60)
                grades[i] = "C";
            else if (percentage >= 50)
                grades[i] = "D";
            else if (percentage >= 40)
                grades[i] = "E";
            else
                grades[i] = "R";
        }

        return grades;
    }

    static void displayScoreCard(int[][] scores, double[][] result, String[] grades) {

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Phy\tChem\tMath\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {

            System.out.println(
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    (int) result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "%\t\t" +
                    grades[i]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int students = sc.nextInt();

        int[][] scores = generateScores(students);

        double[][] result = calculateResults(scores);

        String[] grades = calculateGrade(result);

        displayScoreCard(scores, result, grades);
    }
}