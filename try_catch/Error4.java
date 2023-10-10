package try_catch;

class Error4 {
    public static void main(String args[]) {
        int a[] = { 5, 10 };
        int b = 5;
        try {
            int x = a[2] / b - a[1];

        }

        catch (ArithmeticException e) {
            System.out.println("division by zero");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array index error");
        } catch (ArrayStoreException e) {
            System.out.println("Wrong data type");
        }
        int y = a[1] / a[0];
        System.out.println("y=" + y);

    }
}