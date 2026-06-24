import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FeedbackAnalyzer {

    public static void main(String[] args)
            throws IOException {

        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(System.in));

        int count = 0;

        System.out.println(
                "Enter 5 feedback messages:");

        for (int i = 0; i < 5; i++) {

            String feedback =
                    br.readLine().toLowerCase();

            if (feedback.contains("good")) {
                count++;
            }
        }

        System.out.println(
                "Good Feedback Count = " + count);
    }
}