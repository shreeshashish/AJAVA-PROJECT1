class StaticDemo {
    static int objCount = 0;
    String message;

    StaticDemo(String message) {
        this.message = message;
        objCount++;
    }

    static void showObjectCount() {
        System.out.println("Current object count: " + objCount);
    }

    public static void main(String[] args) {
        StaticDemo.showObjectCount();

        StaticDemo a = new StaticDemo("First object created.");
        System.out.println(a.message);
        StaticDemo.showObjectCount();

        StaticDemo b = new StaticDemo("Second object created");
        System.out.println(b.message);
        StaticDemo.showObjectCount();

        System.out.println("StaticDemo.objCount: " + StaticDemo.objCount);
    }
}