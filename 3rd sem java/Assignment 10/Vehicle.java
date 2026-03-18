public class Vehicle {
    void drive() {
        System.out.println("Repairing a Vehicle.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Repairing a Car.");
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.drive();
    }
}