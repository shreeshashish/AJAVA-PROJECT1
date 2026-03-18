class People {
    String name;
    int age;

    People() {
        this("Unknown", 10);
    }

    People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void print() {
        this.display();
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    People details() {
        return this;
    }

    public static void main(String[] args) {
        People s1 = new People("P.K.Mishra", 60);
        s1.print();
        People s2 = new People();
        s2.print();
        People s3 = s1.details();
        s3.print();
    }
}