package A_JAVA;

public class LeapYr {
    public static void main(String[] args){
        int year=2020;
        if (year % 400 == 0) {
            System.out.println("Leap Year");
        } 
        else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap Year");
        } 
        else {
            System.out.println("Not a Leap Year");
        }
    }
    
}

