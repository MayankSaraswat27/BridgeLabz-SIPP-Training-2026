import java.util.Scanner;

public class WordLength2D {

    static String[] splitText(String text) {
        int count = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                count++;
        }

        String[] words = new String[count];

        int index = 0;
        String temp = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = temp;
                temp = "";
            } else {
                temp += text.charAt(i);
            }
        }

        words[index] = temp;

        return words;
    }

    static int length(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count++);
            }
        } catch (Exception e) {
        }

        return count;
    }

    static String[][] getData(String[] words) {
        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(length(words[i]));
        }

        return data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[][] result = getData(splitText(text));

        System.out.println("Word\tLength");

        for (String[] row : result) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}