package A_JAVA;
import java.util.Scanner;
public class PNZ {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if (num>=1){
            System.out.println("Positive");
        }
        else if (num<=1){
            System.out.println("Negetive");
        }
        else{
            System.out.println("Zero");
        }
    }
} 