// Write  a  program  in  Java  which  has  a  class  Shape  having  2 
// overloaded methods area(float radius) and area(float 
// length, float width). Display the area of circle and rectangle 
// using overloaded methods. 
import java.util.Scanner;
class Shape{
    void area(float radius){
        float area = 3.14f * radius * radius;
        System.out.println("Area of Circle is : "+area);
    }
    void area(float length,float width){
        float area = length*width;
        System.out.println("Area ofRectangle : "+area);
    }
}
public class practical11{
public static void main(String[] args) {
        Shape s1 = new Shape();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Radius : ");
        float radius = sc.nextFloat();
        s1.area(radius);

        System.out.print("\n\nEnter Length : ");
        float length = sc.nextFloat();
        
        System.out.print("Enter Width : ");
        float width = sc.nextFloat();
        s1.area(length, width);
        sc.close();
    }
}
