package java_programs;

abstract class Car {
    String color;

    abstract double speed();

    abstract public String toString();

    public Car(String color) {
        System.out.println("car constructor Called");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}

class Audi extends Car {
    double speed;

    public Audi(String color, double speed) {
        super(color);
        System.out.println("audi constructor called");
        this.speed = speed;
    }

    double speed() {
        return speed;
    }

    public String toString() {
        return "audi color:" + super.color + "speed:" + speed();
    }
}

class Mercedes extends Car {
    double distance;
    double time;

    public Mercedes(String color, double distance, double times) {
        super(color);
        System.out.println("Mercedes constructor called");
        this.distance = distance;
        this.time = time;
    }

    double speed() {
        return distance / time;
    }

    public String toString() {
        return "Mercedes color is " + super.color + "  and speed is:" + speed();
    }
}

public class Abstraction {

    public static void main(String args[]) {
        Car s1 = new Audi("red", 2.2);
        Car s2 = new Mercedes("yellow", 2, 4);
        System.out.println(s1.toString());
        System.out.println(s2.toString());

    }
}