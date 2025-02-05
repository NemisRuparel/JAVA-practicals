// Write a program in Java to demonstrate multilevel inheritance
class AA{
    int i=0;
}
class BB extends AA{
    int j=0;
    void bmethod(){
        i = 10;
        System.out.println("BB class accessing AA class variable's value : "+i);
    }
}
class CC extends BB{
    void cmethod(){
        j=15;
        System.out.println("CC class accessing BB class variable's value : "+j);
    }
}

public class practical15 {
    public static void main(String[] args) {
        BB b1 = new BB();
        CC c1 = new CC(); 

        b1.bmethod();
        c1.cmethod();
    } 
}
