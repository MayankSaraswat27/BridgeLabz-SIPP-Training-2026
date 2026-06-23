import java.util.Scanner;

public class RockPaperScissors {

    static String computerChoice() {

        int choice = (int) (Math.random() * 3);

        if (choice == 0)
            return "Rock";
        if (choice == 1)
            return "Paper";

        return "Scissors";
    }

    static int winner(String user, String computer) {

        if (user.equals(computer))
            return 0;

        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Paper") && computer.equals("Rock")) ||
            (user.equals("Scissors") && computer.equals("Paper")))
            return 1;

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int games = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;

        System.out.println("User\tComputer\tWinner");

        for (int i = 0; i < games; i++) {

            String user = sc.next();
            String computer = computerChoice();

            int result = winner(user, computer);

            String win;

            if (result == 1) {
                userWins++;
                win = "User";
            } else if (result == -1) {
                computerWins++;
                win = "Computer";
            } else {
                win = "Draw";
            }

            System.out.println(user + "\t" + computer + "\t\t" + win);
        }

        double userPercent = (userWins * 100.0) / games;
        double computerPercent = (computerWins * 100.0) / games;

        System.out.println("\nUser Wins = " + userWins);
        System.out.println("Computer Wins = " + computerWins);
        System.out.println("User Win % = " + userPercent);
        System.out.println("Computer Win % = " + computerPercent);
    }
}