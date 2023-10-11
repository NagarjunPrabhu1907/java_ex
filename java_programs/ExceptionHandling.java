package java_programs;

public class ExceptionHandling {
    public static void main(String args[]) {
        int d, a;
        try {
            d = 0;
            a = 42 / d;

        } catch (ArithmeticException e) {
            System.out.println("By printStack method");
            e.printStackTrace();
            System.out.println("by toString() mrthod");// we will only get name and description of an exception. Note
                                                       // that this method is overridden in Throwable class.

            System.out.println(e.toString());

            System.out.println("By getMessage()");// we will only get description of an exception.
            System.out.println(e.getMessage());

        }
    }
}