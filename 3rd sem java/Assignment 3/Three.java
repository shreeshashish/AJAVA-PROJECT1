public class Three{
    public static void main (String args[]){
        int i,num=56789;
        System.out.println("NUmber:"+num);
        System.out.println("sequence of digits:");
        i=num/10000;
        num=num%10000;
        System.out.println(i+" ");
        i=num/1000;
        num=num%1000;
        System.out.println(i+" ");
        i=num/100;
        num=num%100;
        System.out.println(i+" ");
        i=num/10;
        num=num%10;
        System.out.println(i+" ");
        System.out.println(num);
    }
}