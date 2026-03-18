public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        Person p1 = new Person("Shreeshashish", 21);
        Person p2 = new Person("Om", 21);
        p1.print();
        p2.print();
    }
}
