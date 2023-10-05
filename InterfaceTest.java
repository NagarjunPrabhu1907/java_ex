
interface Area {
    final static float pi = 3.14F;

    float compute(float x, float y);
}

class Rectangle implements Area {
    public float compute(float x, float y) {
        return (x * y);

    }
}

class Circle implements Area {
    public float compute(float x, float y) {
        return (pi * x * y);
    }
}

class InterfaceTest {
    public static void Main(String args[]) {
        Rectangle rect = new Rectangle();
        Circle cir = new Circle();
        Area area;
        area = rect;
        System.out.println("Area of rectangle =" + area.compute(10, 20));
        area = cir;
        System.out.println("area of circle =" + area.compute(10, 10));

    }

}
