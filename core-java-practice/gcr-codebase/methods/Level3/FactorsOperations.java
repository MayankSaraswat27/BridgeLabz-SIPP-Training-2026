import java.util.Scanner;

public class FactorsOperations {

    static int[] factors(int number) {

        int count = 0;

        for(int i = 1; i <= number; i++)
            if(number % i == 0)
                count++;

        int[] factors = new int[count];
        int index = 0;

        for(int i = 1; i <= number; i++)
            if(number % i == 0)
                factors[index++] = i;

        return factors;
    }

    static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    static int sumFactors(int[] factors) {

        int sum = 0;

        for(int factor : factors)
            sum += factor;

        return sum;
    }

    static long productFactors(int[] factors) {

        long product = 1;

        for(int factor : factors)
            product *= factor;

        return product;
    }

    static double productCubeFactors(int[] factors) {

        double product = 1;

        for(int factor : factors)
            product *= Math.pow(factor, 3);

        return product;
    }
}