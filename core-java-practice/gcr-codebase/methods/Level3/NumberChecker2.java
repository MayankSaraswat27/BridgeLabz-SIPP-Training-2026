import java.util.Scanner;

public class NumberChecker2 {

    static int[] getDigits(int number) {

        String str = String.valueOf(number);
        int[] digits = new int[str.length()];

        for(int i = 0; i < str.length(); i++)
            digits[i] = str.charAt(i) - '0';

        return digits;
    }

    static int sumDigits(int[] digits) {

        int sum = 0;

        for(int digit : digits)
            sum += digit;

        return sum;
    }

    static double sumSquares(int[] digits) {

        double sum = 0;

        for(int digit : digits)
            sum += Math.pow(digit, 2);

        return sum;
    }

    static boolean isHarshad(int number, int[] digits) {
        return number % sumDigits(digits) == 0;
    }

    static int[][] frequency(int[] digits) {

        int[][] freq = new int[10][2];

        for(int i = 0; i < 10; i++)
            freq[i][0] = i;

        for(int digit : digits)
            freq[digit][1]++;

        return freq;
    }
}