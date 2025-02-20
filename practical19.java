interface I1 {
    public void I1method();
}

interface I2 {
    public void I2method();
}

class C1 implements I1, I2 {
    // int i=10;
    public void I1method() {
        System.out.println("This is implemented I1 method using class C1");
    }

    public void I2method() {
        // System.out.println(this.i);
        System.out.println("This is implemented I2 method using class C1");
    }

    public void display() {
        I1method();
        I2method();
    }
}
public class practical19 {
    public static void main(String[] args) {
        C1 objC1 = new C1();
        objC1.display();
    }
}