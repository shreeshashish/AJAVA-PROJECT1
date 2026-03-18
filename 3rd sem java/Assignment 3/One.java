public class One{
    public static void main(String args[]){
        int num=664;
        if(num<0 || num>1000){
            System.out.println("invalid inut");
        }
        else{
            int n1=num%10;
            int n2=(num/10)%10;
            int n3=(num/100);
            int sum=n1+n2+n3;
            System.out.println("sum of the digits is:"+sum);
        }
    }
}