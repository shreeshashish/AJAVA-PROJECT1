public class One{
    public static void main(String args[]){
        double a=8.0f,b=2.0f,c=-15.0f,d,x1,x2;
        System.out.println("for quadratic equation,(a^2)x+bx+c=0");
        System.out.println("where a="+a+"b="+b+"and c="+c);
        d=b*b-4*a*c;
        if(d>0){
            x1=(-b+Math.sqrt(d))/(2*a);
            x2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("The roots are:"+x1+"and"+x2);
        }
        else if(d==0){
            x1=(-b)/(2*a);
            x2=x1;
            System.out.println("The roots are:"+x1+"and"+x2);
        }
        else{
            System.out.println("As discriminant is negetive i.e d="+d+"there are no real roots.");
        }
    }
}