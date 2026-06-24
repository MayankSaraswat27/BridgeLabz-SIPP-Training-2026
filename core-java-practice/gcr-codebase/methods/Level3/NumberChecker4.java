import java.util.Scanner;

public class NumberChecker4 {

    static boolean isPrime(int number) {

        if(number <= 1)
            return false;

        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0)
                return false;
        }

        return true;
    }

    static boolean isNeon(int number) {

        int square = number * number;
        int sum = 0;

        while(square > 0) {
            sum += square % 10;
            square /= 10;
        }

        return sum == number;
    }

    static boolean isSpy(int number) {

        int sum = 0;
        int product = 1;

        while(number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }

        return sum == product;
    }

    static boolean isAutomorphic(int number) {

        int square = number * number;

        return String.valueOf(square)
                .endsWith(String.valueOf(number));
    }

    static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }
}