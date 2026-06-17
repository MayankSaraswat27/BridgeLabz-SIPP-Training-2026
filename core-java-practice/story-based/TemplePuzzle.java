public class TemplePuzzle {

    static void hanoi(int n, char src, char aux, char dest) {
        if(n == 1) {
            System.out.println(src + " -> " + dest);
            return;
        }

        hanoi(n-1, src, dest, aux);
        System.out.println(src + " -> " + dest);
        hanoi(n-1, aux, src, dest);
    }

    static int binarySearch(int[] arr, int low, int high, int key) {
        if(low > high)
            return -1;

        int mid = (low + high) / 2;

        if(arr[mid] == key)
            return mid;

        if(key < arr[mid])
            return binarySearch(arr, low, mid-1, key);

        return binarySearch(arr, mid+1, high, key);
    }

    static int sumDigits(int n) {
        if(n == 0)
            return 0;

        return n % 10 + sumDigits(n / 10);
    }

    static String reverse(String s) {
        if(s.length() <= 1)
            return s;

        return reverse(s.substring(1)) + s.charAt(0);
    }

    static boolean balanced(String s, int count, int index) {

        if(count < 0)
            return false;

        if(index == s.length())
            return count == 0;

        if(s.charAt(index) == '(')
            return balanced(s, count + 1, index + 1);

        if(s.charAt(index) == ')')
            return balanced(s, count - 1, index + 1);

        return balanced(s, count, index + 1);
    }

    public static void main(String[] args) {

        System.out.println("Tower of Hanoi:");
        hanoi(3, 'A', 'B', 'C');

        int[] arr = {10,20,30,40,50};

        System.out.println("Binary Search: "
                + binarySearch(arr,0,arr.length-1,40));

        System.out.println("Sum Digits: "
                + sumDigits(1234));

        System.out.println("Reverse: "
                + reverse("Temple"));

        System.out.println("Balanced: "
                + balanced("(()())",0,0));
    }
}