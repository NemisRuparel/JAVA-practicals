// Aim: Write a program in Java demonstrate the use of “this” keyword.
class This {
    int height;
    int width;

    This(int height, int width) {
        this.height = height;
        this.width = width;
    }

    int area() {
        return height * width;
    }
}

public class practical8 {
    public static void main(String s[]) {
        This t = new This(5, 6);
        int mul = t.area();
        System.out.println(mul);
    }
}

