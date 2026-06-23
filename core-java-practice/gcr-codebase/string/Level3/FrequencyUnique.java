import java.util.Scanner;

public class FrequencyUnique {

    static char[] uniqueCharacters(String text) {

        char[] temp = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {

            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique)
                temp[index++] = text.charAt(i);
        }

        char[] result = new char[index];

        for (int i = 0; i < index; i++)
            result[i] = temp[i];

        return result;
    }

    static String[][] frequency(String text) {

        char[] unique = uniqueCharacters(text);

        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {

            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (unique[i] == text.charAt(j))
                    count++;
            }

            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(count);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[][] result = frequency(text);

        for (String[] row : result) {
            System.out.println(row[0] + " -> " + row[1]);
        }
    }
}