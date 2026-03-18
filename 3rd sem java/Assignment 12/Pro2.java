import java.util.Scanner;

public class Pro2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String 1: ");
        String s1 = sc.nextLine();
        System.out.print("String 2: ");
        String s2 = sc.nextLine();
        if(s1.length() != s2.length()) {
            System.out.println("The strings are not same.");
        }
        else {
            boolean isEqual = true;
            for(int i=0; i < s1.length() && i < s2.length(); i++) {
                if(s1.charAt(i) != s2.charAt(i)) {
                    isEqual = false;
                    System.out.println("The strings are not same.");
                    break;
                }
            }
            if(isEqual == true) {
                System.out.println("The strings are same.");
            }
        }
        sc.close();
    }
}