import java.util.Arrays;

public class FootballTeam {

    static int[] generateHeights() {

        int[] heights = new int[11];

        for(int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int)(Math.random() * 101);
        }

        return heights;
    }

    static int findSum(int[] heights) {

        int sum = 0;

        for(int height : heights)
            sum += height;

        return sum;
    }

    static double findMean(int[] heights) {
        return (double)findSum(heights) / heights.length;
    }

    static int findShortest(int[] heights) {

        int min = heights[0];

        for(int height : heights)
            min = Math.min(min, height);

        return min;
    }

    static int findTallest(int[] heights) {

        int max = heights[0];

        for(int height : heights)
            max = Math.max(max, height);

        return max;
    }

    public static void main(String[] args) {

        int[] heights = generateHeights();

        System.out.println("Heights = " + Arrays.toString(heights));
        System.out.println("Mean Height = " + findMean(heights));
        System.out.println("Shortest Height = " + findShortest(heights));
        System.out.println("Tallest Height = " + findTallest(heights));
    }
}