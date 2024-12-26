package com.tabriji.objectAndClass;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInformPerson() {
    }

    private String printInfoPrivate() {
        return "Hello";
    }
}
