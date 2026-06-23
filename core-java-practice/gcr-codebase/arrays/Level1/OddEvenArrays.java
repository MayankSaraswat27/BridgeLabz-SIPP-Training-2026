import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(number <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];

        int oddIndex = 0;
        int evenIndex = 0;

        for(int i = 1; i <= number; i++) {
            if(i % 2 == 0)
                even[evenIndex++] = i;
            else
                odd[oddIndex++] = i;
        }

        System.out.print("Odd: ");
        for(int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.print("\nEven: ");
        for(int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
    }
}