public class One{
    public static void main(String args[]){
        if(args.length<3){
            System.out.println("enter 3 strings:");
            return;
        }
        String first=args[0];
        String second=args[1];
        String last=args[2];
        char initial1=first.charAt(0);
        char initial2=second.charAt(1);
        System.out.println(initial1+"."+initial2+"."+last+".");
    }
}