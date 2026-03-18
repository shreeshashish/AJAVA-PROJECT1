import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] duplicate = new int[size/2];
        System.out.println("Enter integers into the array:");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        boolean present;
        for(int i=0; i < size; i++) {
            present = false;
            for(int j=0; j<count; j++) {
                if(arr[i]==duplicate[j]) {
                    present = true;
                    break;
                }
            }
            if(present==false) {
                for(int j=i+1; j<size; j++) {
                    if(arr[i]==arr[j]) {
                        duplicate[count] = arr[i];
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println("Duplicate values in the above array: ");
        if(count==0) {
            System.out.println("No duplicate values present.");
        }
        else {
            for(int i=0; i<count; i++){
                System.out.print(duplicate[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
