public class Rectangle {
    int width;
    int height;

    Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }

    void area() {
        System.out.println("Area is: " + (width*height));
    }

    void perimeter() {
        System.out.println("Perimeter is: " + 2*(width+height));
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        r1.area();
        r1.perimeter();
    }
}
