public class Mathoperation {

    static float mul(float x, float y) {
        return x * y;
    }

    static float divide(float x, float y) {
        return x / y;
    }
}

class MathApplication {
    public static void main(String args[]) {
        float a = Mathoperation.mul(4, 5);
        float b = Mathoperation.divide(a, 20);
        System.out.println("b=" + b);

    }
}