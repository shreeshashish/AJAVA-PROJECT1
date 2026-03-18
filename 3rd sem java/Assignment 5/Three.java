import java.util.Scanner;
public class Three {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum;
        int num=sc.nextInt();
        if(num<1000000||num>9999999){
            System.out.println("Invlaid input.");
        }
        else{
            int d2=(num/100000)%10;
            int d4=(num/1000)%10;
            int d6=(num/10)%10;
            sum=d2+d4+d6;
            System.out.println("Sum of all digits at even position is:"+sum);
        }
    }
}
