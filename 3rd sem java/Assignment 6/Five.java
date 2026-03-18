import java.util.Scanner;
public class Five {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of first string array:");
        int size1=sc.nextInt();
        String[] arr1=new String[size1];
        System.out.println("Enter strings into first array:");
        for(int i=0;i<size1;i++){
            arr1[i]=sc.next();
        }
        System.out.println("Enter size of second array:");
        int size2=sc.nextInt();
        String[] arr2=new String[size2];
        System.out.println("Enter stirngs into second array:");
        for(int i=0;i<size2;i++){
            arr2[i]=sc.next();
        }
        String[] common;
        if(size1<size2){
            common=new String[size1];
        }
        else{
            common=new String[size2];
        }
        int count=0;
        // boolean present;
        for(int i = 0;i<size1;i++){
           
            for(int j = 0;j<size2;j++){
                if(arr1[i].equals(arr2[j])){
                    common[count]=arr1[i];
                    count++;
                    break;
                }
            }
        }
        System.out.println("common elements in the above array:");
        if(count==0){
            System.out.println("no common elements present.");
        }
        else{
            for(int i=0;i<count;i++){
                System.out.println(common[i]+" ");
            }
        }
        sc.close();    
    }
}
