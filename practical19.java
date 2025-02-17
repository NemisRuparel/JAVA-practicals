interface I1{
    public void I1method();
}
interface I2{
    public void I2method();
}
class C1 implements I1,I2{
        public void I1method(){
            System.out.println("This is implemented I1 method using class C1");
        }
        public void I2method(){
            System.out.println("This is implemented I2 method using class C1");
        }
}
public class practical19 {
    public static void main(String[] args) {
        C1 objC1 = new C1();
        objC1.I1method();
        objC1.I2method();
    }
    
}