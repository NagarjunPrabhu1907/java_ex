package java2;

public class AccessModifiersExample {

    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        // Accessing public members
        myObject.publicVar = 10;
        myObject.publicMethod();

        // Accessing protected members
        myObject.protectedVar = 20;
        myObject.protectedMethod();

        // Accessing private members (Not allowed, will result in a compilation error)
        // myObject.privateVar = 30;
        // myObject.privateMethod();
    }
}

class MyClass {
    // Public member
    public int publicVar;

    // Public method
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Protected member
    protected int protectedVar;

    // Protected method
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    // Private member
    private int privateVar;

    // Private method
    private void privateMethod() {
        System.out.println("This is a private method.");
    }
}
