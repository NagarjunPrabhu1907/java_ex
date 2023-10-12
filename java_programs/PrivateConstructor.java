package java_programs;

import java.io.*;

class Person1 {
    static Person1 name = null;
    public int age = 12;

    private Person1() { // This is private constrct ,can not be accessed outside the class

    }

    static public Person1 getInstance() {
        if (name == null)
            name = new Person1();

        return name;
    }
}

public class PrivateConstructor {
    public static void main(String args[]) {
        Person1 a = Person1.getInstance();
        Person1 b = Person1.getInstance();
        a.age = a.age + 10;
        System.out.println("value of a.age=" + a.age);
        System.out.println("value of b.age=" + b.age);
    }

}
