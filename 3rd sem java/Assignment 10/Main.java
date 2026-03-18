import java.util.Scanner;
class Vehiclee {
    String make;
    String model;
    int year;
    String fuel;

    Vehiclee(String make, String model, int year, String fuel) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuel = fuel;
    }

    void fuelEfficiency() {
        Scanner sc = new Scanner(System.in);
        double dist, fuel;
        System.out.print("Distance travelled: ");
        dist = sc.nextDouble();
        System.out.print("Fuel consumed: ");
        fuel = sc.nextDouble();
        System.out.println("Fuel Efficiency: " + dist/fuel);
        System.out.println();
    }

    void display(String name, int max) {
        System.out.println("Vehicle: " + name + "\nMake: " + make + "\nModel: " + model + "\nYear: " + year + "\nFuel Type: " + fuel + "\nMaximum speed: " + max);
        fuelEfficiency();
    }
}

class Truck extends Vehiclee {
    Truck(String make, String model, int year, String fuel) {
        super(make, model, year, fuel);
    }
}

class Car extends Vehiclee {
    Car(String make, String model, int year, String fuel) {
        super(make, model, year, fuel);
    }
}

class Motorcycle extends Vehiclee {
    Motorcycle(String make, String model, int year, String fuel) {
        super(make, model, year, fuel);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Truck t = new Truck("Tata", "Intra V30", 2025, "Diesel");
        t.display("Truck", 80);
        Car c = new Car("Maruti Suzuki", "Swift", 2025, "Petrol");
        c.display("Car", 200);
        Motorcycle m = new Motorcycle("Royal Enfield", "Classic 350", 2024, "Petrol");
        m.display("Motorcycle", 115);
    }
}