public class Two {
    public static void main(String args[]){
        int input = 9876543;
        int year,days;
        System.out.println(input+"minutes is approximately");
        year=input/525600;
        input=input%525600;
        days=input/1440;
        System.out.println(year+"year and"+days+"days");

    }
}
