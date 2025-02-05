// Write a program in Java to demonstrate method overriding.
class sum{
    void calculate(int a,int b){}
}
class sub extends sum{
    void calculate(int a,int b){
         int c= a-b;
         System.out.println("Substraction of values using overriding method : "+c);        
    }
}
public class practical17{
    public static void main(String[] args) {
        sub s1 = new sub();
        s1.calculate(10, 10);
    }
}