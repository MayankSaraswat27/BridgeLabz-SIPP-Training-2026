import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker3 {

    static int[] getDigits(int number) {

        String str = String.valueOf(number);
        int[] digits = new int[str.length()];

        for(int i = 0; i < str.length(); i++)
            digits[i] = str.charAt(i) - '0';

        return digits;
    }

    static int[] reverse(int[] digits) {

        int[] rev = new int[digits.length];

        for(int i = 0; i < digits.length; i++)
            rev[i] = digits[digits.length - 1 - i];

        return rev;
    }

    static boolean compare(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    static boolean isPalindrome(int[] digits) {
        return compare(digits, reverse(digits));
    }

    static boolean isDuckNumber(int[] digits) {

        for(int i = 1; i < digits.length; i++)
            if(digits[i] == 0)
                return true;

        return false;
    }
}