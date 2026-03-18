package A_JAVA;

import java.util.Scanner;

public class Pass_Fail {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your percentage:");
        int per=sc.nextInt();
        if(per>=33){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
