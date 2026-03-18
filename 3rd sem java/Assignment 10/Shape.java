public class Shape {
    void getPerimeter() {
        
    }

    void getArea() {
        
    }
}

class Circle extends Shape {
    double rad;

    Circle(double rad) {
        this.rad = rad;
    }

    void getPerimeter() {
        System.out.println("Circumference of circle: " + 2.0 * 3.14 * rad); 
    }

    void getArea() {
        System.out.println("Area of circle: " + 3.14 * rad * rad);
    }

    public static void main(String[] args) {
        Circle c = new Circle(10.0);
        c.getPerimeter();
        c.getArea();
    }
}