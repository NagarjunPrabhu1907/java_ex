package java_programs;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I am " + age + " years old.");
    }
}

class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public void study() {
        System.out.println(name + " with Student ID " + studentId + " is studying.");
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject + ".");
    }
}

public class abstrattion11 {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, "S12345");
        Teacher teacher = new Teacher("Mr. Smith", 35, "Math");

        student.introduce();
        student.study();

        teacher.introduce();
        teacher.teach();
    }
}
