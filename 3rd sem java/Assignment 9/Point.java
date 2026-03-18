public class Point {
    double x;
    double y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        System.out.println("x: " + x );
        System.out.println("y: " + y);
        System.out.println();
    }

    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        p1.print();

        Point p2 = new Point(3.5, 4.7);
        p2.print();
    }
}