package java_programs;

import java.time.LocalTime;

public class AirplaneMain {
    public static void main(String[] args) {
        Airplane flight1 = new Airplane("CDE345", "London", LocalTime.of(10, 30));
        Airplane flight2 = new Airplane("KUI765", "New York", LocalTime.of(14, 0));
        Airplane flight3 = new Airplane("JUY456", "Paris", LocalTime.of(14, 0));
        System.out.println("Flight Status:");
        flight1.checkStatus();
        flight2.checkStatus();
        flight3.checkStatus();
        flight1.delay(40);
        flight2.delay(110);
        System.out.println("\nCurrent Flight Status:");
        flight1.checkStatus();
        flight2.checkStatus();
        flight3.checkStatus();
    }
}