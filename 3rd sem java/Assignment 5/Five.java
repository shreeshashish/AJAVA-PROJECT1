import java.io.*;
public class Five {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int num=Integer.parseInt(br.readLine());
        int original=num;
        int sum=0;
        int digits=0;
        int temp=num;
        while(temp>0){
            digits++;
            temp=temp/10;
        }
        temp=num;
        while(temp>0){
            int digit=temp%10;
            sum+=Math.pow(digit,digits);
            temp=temp/10;
        }
        if(sum==original){
            System.out.println(original+" is an armstrong number.");
        }
        else{
            System.out.println(original+" is not a amstrong number.");
        }
    }    
}
