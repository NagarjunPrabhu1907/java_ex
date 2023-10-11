package java_programs;

class Employee {
    private int empno;
    private String name;
    private double salary;

    public int getempno() {
        return empno;
    }

    public String getName() {
        return name;

    }

    public double getsalary() {
        return salary;
    }

    public void setempno(int e) {
        empno = e;
    }

    public void setname(String n) {
        name = n;
    }

    public void setsalary(double s) {
        salary = s;
    }
}

public class Encapsulation {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        e1.setempno(1);
        e1.setname("Arjun");
        e1.setsalary(45000);
        System.out.println("Employee No:" + e1.getempno() + "\tName:" + e1.getName() + "\tsalary:" + e1.getsalary());

        Employee e2 = new Employee();
        e2.setempno(2);
        e2.setname("virat");
        e2.setsalary(18000);
        System.out.println("Employee No:" + e2.getempno() + "\tName:" + e2.getName() + "\tsalary:" + e2.getsalary());

    }

}
