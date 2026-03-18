import java.util.Scanner;
public class One{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter integers into array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int c;
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-1-i;j++){
                if(arr[j]>arr[j+1]){
                    c=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=c;
                }
            }
        }
        System.out.println("sorted array is:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}