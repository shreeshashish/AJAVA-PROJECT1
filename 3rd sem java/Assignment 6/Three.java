import java.util.Scanner;
public class Three {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter integers into array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0],max=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum value for the above array is:"+max);
        System.out.println("Minimum value for the above array is:"+min);
        sc.close();
    }
}
