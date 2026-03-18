class Bank {
    float p;
    float r = 1.0f;
    int t;

    public Bank(float p, int t) {
        this.p = p;
        this.t = t;
    }

    void interest() {
        float si = (p*r*t) / 100.0f;
        System.out.println("Bank: Bank\nPrincipal: Rs. " + p + "\nTime Period: " + t + "\nRate of Interest: " + r + "\nSimple Interest: " + si + "\n");
    }
}

class SBI extends Bank {
    float r = 8.4f;

    SBI(float p, int t) {
        super(p, t);
    }

    void interest() {
        float si = (p*r*t) / 100.0f;
        System.out.println("Bank: SBI\nPrincipal: Rs. " + p + "\nTime Period: " + t + "\nRate of Interest: " + r + "\nSimple Interest: " + si + "\n");
    }
}

class ICICI extends Bank {
    float r = 7.3f;

    ICICI(float p, int t) {
        super(p, t);
    }

    void interest() {
        float si = (p*r*t) / 100.0f;
        System.out.println("Bank: ICICI\nPrincipal: Rs. " + p + "\nTime Period: " + t + "\nRate of Interest: " + r + "\nSimple Interest: " + si + "\n");
    }
}

class Axis extends Bank {
    float r = 9.7f;

    Axis(float p, int t) {
        super(p, t);
    }

    void interest() {
        float si = (p*r*t) / 100.0f;
        System.out.println("Bank: Axis\nPrincipal: Rs. " + p + "\nTime Period: " + t + "\nRate of Interest: " + r + "\nSimple Interest: " + si + "\n");
    }
}

public class Main {
    public static void main(String[] args) {
        SBI sbi = new SBI(10000, 5);
        sbi.interest();
        ICICI icici = new ICICI(10000, 5);
        icici.interest();
        Axis axis = new Axis(10000, 5);
        axis.interest();
    }
}