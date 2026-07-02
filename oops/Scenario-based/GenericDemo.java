import java.util.*;

// Generic Pair Class
class Pair<T, U> {
    private T first;
    private U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public void display() {
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }
}

// Generic Stack Class
class Stack<T> {
    private ArrayList<T> stack = new ArrayList<>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    public void display() {
        System.out.println("Stack: " + stack);
    }
}

// Generic Repository
class Repository<T> {
    private ArrayList<T> data = new ArrayList<>();

    public void add(T item) {
        data.add(item);
    }

    public void display() {
        System.out.println(data);
    }
}

public class GenericDemo {

    // Generic Method with Comparable Bound
    public static <T extends Comparable<T>> T findMax(T[] arr) {

        T max = arr[0];

        for (T item : arr) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }

        return max;
    }

    // Wildcard Method
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Pair
        Pair<String, Integer> p = new Pair<>("Mayank", 21);
        p.display();

        System.out.println();

        // Stack
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();

        System.out.println("Popped: " + s.pop());
        s.display();

        System.out.println();

        // findMax
        Integer[] nums = {10, 50, 30, 70, 40};
        System.out.println("Maximum Number: " + findMax(nums));

        String[] names = {"Aman", "Rahul", "Mayank"};
        System.out.println("Maximum String: " + findMax(names));

        System.out.println();

        // Repository
        Repository<String> repo1 = new Repository<>();
        repo1.add("Java");
        repo1.add("Python");
        repo1.display();

        Repository<Integer> repo2 = new Repository<>();
        repo2.add(100);
        repo2.add(200);
        repo2.display();

        System.out.println();

        // Wildcard
        List<String> list1 = Arrays.asList("Apple", "Banana", "Mango");
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4);

        printList(list1);
        printList(list2);
    }
}