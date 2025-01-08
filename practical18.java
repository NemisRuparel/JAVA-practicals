class Car {
    int topSpeed;
    String name;

    
    Car(String name, int topSpeed) {
        this.name = name;
        this.topSpeed = topSpeed;
    }
    public String toString() {
        return "Car Name: " + name + ", Top Speed: " + topSpeed + " km/h";
    }
}

public class practical18 {
    public static void main(String[] args) {

        Car c1 = new Car("Audi", 100);
        Car c2 = new Car("Verna", 150);
        Car c3 = new Car("Venue", 134);
        Car c4 = new Car("Ertiga", 164);
        Car c5 = new Car("Xcent", 120);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
    }
}
