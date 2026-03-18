public class SimpleInterest {
    float p, t, i;
    float r = 5.0f;

    void interest() {
        i = (p*r*t)/100.0f;
    }

    SimpleInterest(float principal, float time) {
        this.p = principal;
        this.t = time;
    }

    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest(50000.0f, 4.0f);
        si.interest();
        System.out.println("Simple Interest = " + si.i);
    }
}
