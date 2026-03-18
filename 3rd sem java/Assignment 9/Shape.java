public class Shape{
    float length;
    float breadth;

    void calculate(float side) {
        this.length = side;
        this.breadth = side;
        System.out.println("Area of square = " + (side*side));
    }

    void calculate(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("Area of rectangle = " + (length*breadth));
    }

    void calculate(float a, float b, float c) {
        this.length = a;
        this.breadth = b;
        float side3 = c;
        float s = (length + breadth + side3) / 2;
        float area =  (float)Math.sqrt(s * (s - length) * (s - breadth) * (s - side3));
        System.out.println("Area of scalene triangle = " + area);
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.calculate(10, 5);
        shape.calculate(5);
        shape.calculate(3,4,5);
    }
}