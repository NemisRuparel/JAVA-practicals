abstract class Shape{
    abstract float area(float b,float h);
}
class Triangle extends Shape{
    float area(float b,float h){
            return   (b * h)/2;
        }
}
class Rectangle extends Shape{
    float area(float l,float w){
            return l * w;
    }
}
class Circle extends Shape{
    
    float area(float r,float r1){
        return r1 * (r * r);

    }
}
public class practical20 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        System.out.println("Area of Triangle : "+t1.area(10, 10));

        Rectangle r1 = new Rectangle();
        System.out.println("Area of Rectangle is : "+r1.area(10, 10));

        Circle c1 = new Circle();
        System.out.println("Area of Circle is : "+c1.area(10,3.14f));
    }    
}
