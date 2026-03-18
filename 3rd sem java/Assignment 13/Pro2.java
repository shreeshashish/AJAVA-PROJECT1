import java.util.Scanner;
public class Pro2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements into the array: ");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        try{
            System.out.println("Element at index [" + index + "] is " + arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        sc.close();
    }
}