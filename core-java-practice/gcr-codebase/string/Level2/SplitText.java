import java.util.Scanner;

public class SplitText {

    static String[] splitText(String text) {
        int words = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                words++;
        }

        String[] result = new String[words];

        int index = 0;
        String word = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                result[index++] = word;
                word = "";
            } else {
                word += text.charAt(i);
            }
        }

        result[index] = word;
        return result;
    }

    static boolean compare(String[] a, String[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] arr1 = splitText(text);
        String[] arr2 = text.split(" ");

        System.out.println(compare(arr1, arr2));
    }
}