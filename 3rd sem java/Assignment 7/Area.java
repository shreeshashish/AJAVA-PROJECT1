public class Area {
    int sqarea;
    static int recarea;

    void square(int side) {
        sqarea = side*side;
    }

    static void rectangle(int length, int breadth) {
        recarea = length*breadth;
    }

    public static void main(String[] args) {
        Area ar = new Area();
        ar.square(8);
        Area.rectangle(10, 8);
        System.out.println("Area of square = " + ar.sqarea);
        System.out.println("Area of rectangle = " + Area.recarea);
    }
}

