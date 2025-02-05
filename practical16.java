// Write a program in Java to demonstrate hierarchical inheritance.
class A{
    int i=0;
}
class B extends A{
    void bmethod(){
        i = 10;
        System.out.println("B class accessing A class variable's value : "+i);
    }
}
class C extends A{
    void cmethod(){
        i = 15;
        System.out.println("C class accessing A class variable's value : "+i);
    }
}
public class practical16 {
public static void main(String[] args) {
        B b1 = new B();
        C c1 = new C(); 

        b1.bmethod();
        c1.cmethod();
    } 
}

