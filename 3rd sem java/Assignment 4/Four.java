public class Four {
    public static void main(String args[]){
        int n=7,sum=0;
        System.out.println("input number of terms are:"+n);
        System.out.println("The odd numbers are:");
        for(int i=1,odd=1;i<=n;i++,odd=odd+2){
            System.out.println(odd);
            sum=sum+odd;
        }
        System.out.println("The sum of odd natural numbers upto"+n+"terms is"+sum);
    }
}
