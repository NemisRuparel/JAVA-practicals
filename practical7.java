// Aim: Write a program in Java which has a class Rectangle having two instance variables height 
// and weight. Initialize the class using constructor.
class Rectangle{
    int height;
    int width;
    Rectangle(int h ,int w){
        height = h;
        width = w;
    }
}
public class practical7 {
    public static void main(String s[]){
        Rectangle R = new Rectangle(6,5);
        System.out.println(R.height);
        System.out.println(R.width);


    }
}