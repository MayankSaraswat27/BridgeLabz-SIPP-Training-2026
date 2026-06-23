import java.util.Scanner;

public class NumberAnalysis {

    static boolean isPositive(int number) {
        return number >= 0;
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static int compare(int number1, int number2) {

        if(number1 > number2)
            return 1;

        if(number1 < number2)
            return -1;

        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for(int number : numbers) {

            if(isPositive(number)) {

                if(isEven(number))
                    System.out.println(number + " Positive Even");
                else
                    System.out.println(number + " Positive Odd");
            }
            else {
                System.out.println(number + " Negative");
            }
        }

        int result =
                compare(numbers[0], numbers[4]);

        if(result == 1)
            System.out.println("First is Greater");
        else if(result == -1)
            System.out.println("First is Less");
        else
            System.out.println("Both are Equal");
    }
}