package A_JAVA;
import java.util.Scanner;
public class Voting {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Person is eligible for vote.");
        }
        else{
            System.out.println("Person is not eligible for vote.");
        }
    }
}
