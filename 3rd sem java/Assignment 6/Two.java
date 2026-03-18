import java.util.Scanner;
public class Two {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array:");
    int size=sc.nextInt();
    float[] arr=new float[size];
    System.out.println("Enter integers into array:");
    for(int i = 0; i < size; i++) {
        arr[i] = sc.nextInt();
    }
    float total=0.0f;
    int count=0;
    for(int i=0;i<size;i++){
        total +=arr[i];
        count++;
    }
    System.out.println("anerage value f array element is:"+total/count);
    sc.close();
  }  
}
