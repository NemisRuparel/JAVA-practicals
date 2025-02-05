// Write a program in Java to demonstrate single inheritance
class Provider{
    int i=10;
}
class Consumer extends Provider{
    public void print() {
        System.out.println("Child class accessing Parent class variable : "+i);
    }
}
public class Practical14{
    public static void main(String s[]){
        Consumer c1 = new Consumer();
        c1.print();
    }
}