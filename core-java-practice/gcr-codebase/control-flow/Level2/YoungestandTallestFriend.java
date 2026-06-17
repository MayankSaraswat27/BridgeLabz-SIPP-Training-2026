import java.util.*;
public class YoungestandTallestFriend {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int amarAge = sc.nextInt();
        int akbarAge = sc.nextInt();
        int anthonyAge = sc.nextInt();

        double amarHeight = sc.nextDouble();
        double akbarHeight = sc.nextDouble();
        double anthonyHeight = sc.nextDouble();

        String youngest = "";
        String tallest = "";

        int minAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));

        if (minAge == amarAge)
            youngest = "Amar";
        else if (minAge == akbarAge)
            youngest = "Akbar";
        else
            youngest = "Anthony";

        double maxHeight = Math.max(amarHeight,
                Math.max(akbarHeight, anthonyHeight));

        if (maxHeight == amarHeight)
            tallest = "Amar";
        else if (maxHeight == akbarHeight)
            tallest = "Akbar";
        else
            tallest = "Anthony";

        System.out.println("Youngest Friend: " + youngest);
        System.out.println("Tallest Friend: " + tallest);
    }
}
