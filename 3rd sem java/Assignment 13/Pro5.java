import Arithmetic.*;
public class Pro5 {
    public static void main(String[] args) {
        int a1 = 10;
        int b1 = 5;
        double a2 = 10.0;
        double b2 = 4.0;
        Division d = new Division();
        Multiplication m = new Multiplication();
        System.out.println("Integers: a = " + a1 + ", b = " + b1);
        System.out.println("Quotient(a/b) = " + d.quotient(a1, b1) + "\nProduct(a*b) = " + m.product(a1, b1));
        System.out.println("\nDoubles: a = " + a2 + ", b = " + b2);
        System.out.println("Quotient(a/b) = " + d.quotient(a2, b2) + "\nProduct(a*b) = " + m.product(a2, b2));
    }
}
