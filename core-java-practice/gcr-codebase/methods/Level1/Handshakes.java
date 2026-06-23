import java.util.Scanner;

public class Handshakes {

    static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();

        System.out.println("Maximum Handshakes = " +
                calculateHandshakes(students));
    }
}