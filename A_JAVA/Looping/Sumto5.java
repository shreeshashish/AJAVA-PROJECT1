package A_JAVA.Looping;

public class Sumto5 {
    public static void main(String[] args){
        int i=1;
        int sum=0;
        do{  
            sum=sum+i;
            i++;
        }
        while(i<=5);
        System.out.println(sum);
    }
}