import java.util.Scanner;

public class Pro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String 1: ");
        String s1 = sc.nextLine();
        System.out.print("String 2: ");
        String s2 = sc.nextLine();
        if(s1.length() > s2.length()) {
            System.out.println("\"" + s1 + "\" is greater than \"" + s2 + "\"");
        }
        else if(s1.length() < s2.length()) {
            System.out.println("\"" + s1 + "\" is less than \"" + s2 + "\"");
        }
        else {
            int result = s1.compareTo(s2);
            if(result==0)
                System.out.println("Both strings are equal.");
            else if(result > 0)
                System.out.println("\"" + s1 + "\" is greater than \"" + s2 + "\"");
            else
                System.out.println("\"" + s1 + "\" is less than \"" + s2 + "\"");
        }
        sc.close();
    }
}