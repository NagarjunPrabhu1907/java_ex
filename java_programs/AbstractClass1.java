package java_programs;

abstract class Parent {
    Parent() {
        System.out.println("parent constructor called");
    }

    abstract void meth();

    final void meth2() {
        System.out.println("final method called");

    }
}

class child extends Parent {
    child() {
        System.out.println("Child class constructor called");

    }

    void meth() {
        System.out.println("abstract method");
    }
}

public class AbstractClass1 {
    public static void main(String args[]) {
        child c = new child();
        c.meth();
        c.meth2();
        Parent p = new child();
        p.meth2();
    }

}
