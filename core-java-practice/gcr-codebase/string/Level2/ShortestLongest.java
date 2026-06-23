import java.util.Scanner;

public class ShortestLongest {

    static String[] splitText(String text) {
        return text.split(" ");
    }

    static int[] findWords(String[] words) {

        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < words.length; i++) {

            if (words[i].length() < words[shortest].length())
                shortest = i;

            if (words[i].length() > words[longest].length())
                longest = i;
        }

        return new int[] { shortest, longest };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitText(text);

        int[] result = findWords(words);

        System.out.println("Shortest = " + words[result[0]]);
        System.out.println("Longest = " + words[result[1]]);
    }
}