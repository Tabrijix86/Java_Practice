package com.tabriji.objectAndClass;

public class Student extends Person {
    public String major;

    public Student(String name, int age, String gender, String major) {
        super(name, age, gender);
        this.major = major;
    }

    public static void main(String[] args) {
        Student student = new Student("John", 25, "male", "Computer Science");
        student.printInformPerson();
    }

}
