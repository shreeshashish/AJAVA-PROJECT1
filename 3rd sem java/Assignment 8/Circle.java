import java.util.Scanner;
public class Circle {
    float rad;

    Circle(float rad) {
        this.rad = rad;
    }

    void setRadius(float newRad) {
        this.rad = newRad;
    }

    void area() {
        System.out.println("Area of the circle: " + (3.14f*rad*rad));
    }
    
    void circumference() {
        System.out.println("Circumference of the circle: " + (2*3.14f*rad));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle(5.0f);
        System.out.print("Enter radius: ");
        float rad = sc.nextFloat();
        c.setRadius(rad);
        c.area();
        c.circumference();
        sc.close();
    }
}
