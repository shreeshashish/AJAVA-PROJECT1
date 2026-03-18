import java.io.*;
public class Four {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int num=Integer.parseInt(br.readLine());
        int original=num;
        int reversed=0;
        while(num>0){
            int digit=num%10;
            reversed=reversed*10+digit;
            num=num/10;
        }
        if(original==reversed){
            System.out.println(original+" is a pallindrome");
        }
        else{
            System.out.println(original+" is not a pallindrome");
        }
    }
}
