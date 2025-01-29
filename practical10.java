// Write a program in Java to demonstrate the use of "final" keyword.
final class finalKeyword{
        final void increment(){
            int i =0;
            i = i+1 ;
            final float pi =3.14f;
            System.out.println("increment of i using final method : "+i);
            System.out.println("Final variable (PI) : "+pi);
        }
}
/*class inheritedClass extends finalKeyword{
    error: cannot inherit from final finalKeyword
    class inheritedClass extends finalKeyword{   
}*/
public class practical10 {
    public static void main(String s[]){
        finalKeyword fk = new finalKeyword();
        fk.increment();
    }
}

 