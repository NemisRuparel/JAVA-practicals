// Write a program in Java to demonstrate the use of "final" keyword.
import java.util.Scanner;
final class finalKeyword{
        final void increment(){
            int i =0;
            i = i+1 ;
            System.out.println("increment of i using final method : "+i);
        }
}
/*class inheritedClass extends finalKeyword{
    error: cannot inherit from final finalKeyword
    class inheritedClass extends finalKeyword{   
}*/
public class practical10 {
    public static void main(String s[]){
        final float pi = 3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Final Variable : ");
        System.out.print("Enter Radius : ");
        int r = sc.nextInt();
        float result = pi * r * r;
        System.out.println("Area of Circle is  : "+result);
        System.out.println("\n");
        
        finalKeyword fk = new finalKeyword();
        fk.increment();
        sc.close();


    }
}
