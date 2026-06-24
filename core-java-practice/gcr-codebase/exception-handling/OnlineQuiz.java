public class OnlineQuiz {

    public static void main(String[] args) {

        String[] answers = {"A", "B", "C", "D"};

        for (int i = 0; i <= 5; i++) {

            try {

                if (answers[i].equals("A")) {
                    System.out.println(
                            "Question " + (i + 1) + " Correct");
                } else {
                    System.out.println(
                            "Question " + (i + 1) + " Incorrect");
                }

            } catch (ArrayIndexOutOfBoundsException e) {

                System.out.println(
                        "Invalid question index: " + i);

            } catch (NullPointerException e) {

                System.out.println(
                        "Answer is missing at index: " + i);
            }
        }

        System.out.println("Quiz evaluation completed");
    }
}