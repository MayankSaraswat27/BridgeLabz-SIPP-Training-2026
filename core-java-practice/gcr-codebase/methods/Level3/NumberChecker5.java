public class NumberChecker5 {

    static int sumProperDivisors(int number) {

        int sum = 0;

        for(int i = 1; i < number; i++) {
            if(number % i == 0)
                sum += i;
        }

        return sum;
    }

    static boolean isPerfect(int number) {
        return sumProperDivisors(number) == number;
    }

    static boolean isAbundant(int number) {
        return sumProperDivisors(number) > number;
    }

    static boolean isDeficient(int number) {
        return sumProperDivisors(number) < number;
    }

    static int factorial(int n) {

        int fact = 1;

        for(int i = 1; i <= n; i++)
            fact *= i;

        return fact;
    }

    static boolean isStrong(int number) {

        int temp = number;
        int sum = 0;

        while(temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }

        return sum == number;
    }
}