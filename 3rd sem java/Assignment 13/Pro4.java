import Shape.*;
public class Pro4 {
    public static void main(String[] args) {
        int l = 7;
        int b = 6;
        int a = 10;
        Rectangle r = new Rectangle();
        System.out.println("Rectangle:\nLength = " + l + "\nBreadth = " + b);
        System.out.println("Area = " + r.area(l, b) + "\nPerimeter = " + r.perimeter(l, b));
        Square s = new Square();
        System.out.println("\nSquare:\nSide = " + a);
        System.out.println("Area = " + s.area(a) + "\nPerimeter = " + s.perimeter(a));
    }
}
