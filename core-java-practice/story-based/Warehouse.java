import java.util.*;

public class Warehouse {
    public static void main(String[] args) {

        int[] stock = {50, 20, 30, 40, 20, 60, 50};

        int max = stock[0];
        int min = stock[0];
        int total = 0;

        for (int num : stock) {
            if (num > max)
                max = num;
            if (num < min)
                min = num;
            total += num;
        }

        System.out.println("Maximum Stock: " + max);
        System.out.println("Minimum Stock: " + min);
        System.out.println("Total Stock: " + total);

        System.out.print("Duplicate Quantities: ");
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : stock) {
            if (!seen.add(num))
                duplicates.add(num);
        }

        for (int d : duplicates)
            System.out.print(d + " ");
        System.out.println();

        int k = 2;
        int n = stock.length;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = stock[i];
        }

        System.out.println("Rotated Array:");
        System.out.println(Arrays.toString(rotated));

        int[][] shelf = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Original Shelf:");
        for (int[] row : shelf) {
            System.out.println(Arrays.toString(row));
        }

        int rows = shelf.length;
        int cols = shelf[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = shelf[i][j];
            }
        }

        System.out.println("Transposed Shelf:");
        for (int[] row : transpose) {
            System.out.println(Arrays.toString(row));
        }
    }
}