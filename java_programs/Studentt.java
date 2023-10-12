package java_programs;

import java.util.ArrayList;

public class Studentt {
    private String name;
    private int grade;
    private ArrayList<String> courses;

    public Studentt(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<String>();
    }

    public String getName() {
        return name;

    }

    public int getGrade() {
        return grade;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        courses.remove(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public void printStudentDetails() {
        System.out.println("name:" + name);
        System.out.println("grade:" + grade);
    }

}
