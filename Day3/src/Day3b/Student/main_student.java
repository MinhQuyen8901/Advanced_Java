package Day3b.Student;

import Day3b.Student.Student;

public class main_student {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 20;
        s1.color = "White";
        s1.sex = "Male";

        s1.eating("more");
        s1.running("fast");
        s1.drinking("fast");

    }
}
