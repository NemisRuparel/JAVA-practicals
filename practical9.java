class Increment{
    int x,y;
    static int z;

    static{
        System.out.println("This sentance belongs from static block\n");
    }
    void set(){
        x=10;
        y=20;
    }
    static void zincrement(){
        z=z+1;
    }
    void display(){
        System.out.println("X is : " +x);
        System.out.println("Y is : " +y);
        System.out.println("Z is : " +z);
        System.out.println("\n");
    }

}
public class practical9 {
    
    public static void main(String[] args) {
        
        Increment i1 = new Increment();
        Increment i2 = new Increment();
        
        i1.set();
        Increment.zincrement();
        i1.display();

        i2.set();
        Increment.zincrement();
        i2.display();
        
    }

}
