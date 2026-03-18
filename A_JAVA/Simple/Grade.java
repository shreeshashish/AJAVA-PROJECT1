package A_JAVA;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter percentage:");
        int per=sc.nextInt();
        if(per>90){
            System.out.println("Grade=O");
        }
        else if(per>80){
            System.out.println("Grade A");
        }
        else if(per>70){
            System.out.println("Grade B");
        }
        else if(per>60){
            System.out.println("Grade C");
        }
        else if(per>50){
            System.out.println("Grade D");
        }
        else if(per>40){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Fail.");
        }
    }
}
