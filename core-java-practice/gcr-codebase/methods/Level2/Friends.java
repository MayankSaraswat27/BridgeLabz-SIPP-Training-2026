import java.util.Scanner;

public class Friends {

    static int youngest(int[] ages) {

        int min = 0;

        for(int i = 1; i < ages.length; i++) {
            if(ages[i] < ages[min])
                min = i;
        }

        return min;
    }

    static int tallest(double[] heights) {

        int max = 0;

        for(int i = 1; i < heights.length; i++) {
            if(heights[i] > heights[max])
                max = i;
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};

        int[] ages = new int[3];
        double[] heights = new double[3];

        for(int i = 0; i < 3; i++) {
            ages[i] = sc.nextInt();
            heights[i] = sc.nextDouble();
        }

        System.out.println("Youngest: " +
                names[youngest(ages)]);

        System.out.println("Tallest: " +
                names[tallest(heights)]);
    }
}