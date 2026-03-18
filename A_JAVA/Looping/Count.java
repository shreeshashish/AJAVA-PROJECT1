package A_JAVA.Looping;

public class Count {
    public static void main(String[] args){
        int number=23343;
        int count = 0;
        for (; number != 0; number = number / 10){
            count++;
        }
        System.out.println(count);
    }
}
