import java.util.*;

public class SpyAgency {
    public static void main(String[] args) {
        String msg = "madam";

        String rev = new StringBuilder(msg).reverse().toString();
        System.out.println("Reverse: " + rev);

        System.out.println("Palindrome: " + msg.equals(rev));

        int vowels = 0, consonants = 0;
        for(char ch : msg.toLowerCase().toCharArray()) {
            if(Character.isLetter(ch)) {
                if("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        String s1 = "listen";
        String s2 = "silent";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println("Anagram: " + Arrays.equals(a, b));

        String log = "swiss";
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for(char ch : log.toCharArray())
            map.put(ch, map.getOrDefault(ch,0)+1);

        for(char ch : map.keySet()) {
            if(map.get(ch)==1) {
                System.out.println("First Non-Repeating: " + ch);
                break;
            }
        }
    }
}