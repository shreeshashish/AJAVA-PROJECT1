public class Four {
    public static void main(String args[]){
        int a,b;
        a=4;
        b=5;
        if(a<b && a==4){
            System.out.println("a is smaller than b");
        }
        if(a<b || a==0){
            System.out.println("a is smaller than b but not zero");
        }
        if(!((a>b)&&(a==0))){
            System.out.println("both a and b are positive");
        }
    }
}
