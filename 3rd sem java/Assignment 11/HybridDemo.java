class Animal {
    void eat() {
        System.out.println("Animal eats.");
    }
}

interface Walkable {
    void walk();
}

interface Swimmable {
    void swim();
}

class Human extends Animal implements Walkable, Swimmable {
    public void walk() {
        System.out.println("Human walks.");
    }
    public void swim() {
        System.out.println("Human swims.");
    }
}

public class HybridDemo {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        h.walk();
        h.swim();
    }
}