import java.util.Scanner;
public class Pro3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        try{
            int size = Integer.parseInt(sc.next());
            int[] arr = new int[size];
            System.out.println("Enter elements into the array: ");
            for(int i=0; i<size; i++) {
                arr[i] = Integer.parseInt(sc.next());
            }
            System.out.print("Enter index: ");
            int index = Integer.parseInt(sc.next());
            System.out.println("Element at index [" + index + "] is " + arr[index]);
        }
        catch(NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        sc.close();
    }
}
