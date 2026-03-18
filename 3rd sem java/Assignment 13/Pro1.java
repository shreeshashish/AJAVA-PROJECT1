import java.util.Scanner;

public class Pro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        System.out.print("Enter a number: ");
        String str = sc.next();
        try{
            num = Integer.parseInt(str);
            System.out.println("Square of " + num + " is " + num*num);
        }
        catch(NumberFormatException e) {
            System.out.println("Entered input is not a valid format for an integer.");
        }
        sc.close(); 
    }
}