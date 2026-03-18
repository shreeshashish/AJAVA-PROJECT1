interface A {
    default void show() {
        System.out.println("Interface A default show() output.");
    }
}

interface B {
    default void show() {
        System.out.println("Interface B default show() output.");
    }
}

class C implements A, B {
    public void show() {
        A.super.show();
        B.super.show();
        System.out.println("Class C show() output.");
    }
}

public class MultipleDemo {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}