import java.util.Scanner;

public class Pro4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] ch = str.toLowerCase().toCharArray();
        boolean isPalindrome = true;
        for(int i=0, j=str.length()-1; i < j; i++, j--) {
            if(ch[i] != ch[j]) {
                isPalindrome = false;
                System.out.println(str + " is not palindrome.");
                break;
            }
        }
        if(isPalindrome == true) {
            System.out.println(str + " is palindrome.");
        }
        sc.close();
    }
}