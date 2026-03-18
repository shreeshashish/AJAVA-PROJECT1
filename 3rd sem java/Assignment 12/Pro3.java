import java.util.Scanner;

public class Pro3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        for(int i=65, j=97; i<=90 && j<=122; i++, j++) {
            for(int k=0; k<str.length(); k++) {
                if(ch[k] == (char)i || ch[k] == (char)j) {
                    System.out.println(ch[k] + " - " + k);
                }
            }
        }
        sc.close();
    }
}