// Write  a  program  in  Java  to  demonstrate  the  constructor overloading
class Area {
    final float pi = 3.14f;
    float result;
    float result1;
    Area(float radius){
        result = pi * radius * radius;
    }
    Area(float height,float width){
        result1 = height * width;
    }
    void display(){
        if (result == 0.0) {
            System.out.println("Area of rectangle is : "+result1);
        }
        else{

            System.out.println("Area of circle is : "+result);
        }
    }
}
public class practical12 {
    public static void main(String[] args) {
        
        Area a1 = new Area(10);
        Area a2 = new Area(10, 10);
        
        a1.display();
        a2.display();
    } 
}
