import java.util.Scanner;

public class NumberChecker {

    static int countDigits(int number) {

        int count = 0;

        while(number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    static int[] getDigits(int number) {

        int count = countDigits(number);
        int[] digits = new int[count];

        for(int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    static boolean isDuckNumber(int[] digits) {

        for(int i = 1; i < digits.length; i++) {
            if(digits[i] == 0)
                return true;
        }

        return false;
    }

    static boolean isArmstrong(int number, int[] digits) {

        int sum = 0;
        int power = digits.length;

        for(int digit : digits)
            sum += Math.pow(digit, power);

        return sum == number;
    }

    static int[] largestSecondLargest(int[] digits) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int digit : digits) {

            if(digit > largest) {
                secondLargest = largest;
                largest = digit;
            }
            else if(digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        return new int[]{largest, secondLargest};
    }

    static int[] smallestSecondSmallest(int[] digits) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int digit : digits) {

            if(digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            }
            else if(digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int[] digits = getDigits(number);

        System.out.println("Duck Number = " + isDuckNumber(digits));
        System.out.println("Armstrong = " + isArmstrong(number, digits));

        int[] largest = largestSecondLargest(digits);
        System.out.println("Largest = " + largest[0]);
        System.out.println("Second Largest = " + largest[1]);

        int[] smallest = smallestSecondSmallest(digits);
        System.out.println("Smallest = " + smallest[0]);
        System.out.println("Second Smallest = " + smallest[1]);
    }
}