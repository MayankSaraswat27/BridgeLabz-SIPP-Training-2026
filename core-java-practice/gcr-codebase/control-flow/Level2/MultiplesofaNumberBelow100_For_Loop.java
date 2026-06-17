import java.util.*;
public class MultiplesofaNumberBelow100_For_Loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number > 0 && number < 100) {

            for (int i = number; i < 100; i += number) {
                System.out.print(i + " ");
            }
        }
    }
}
