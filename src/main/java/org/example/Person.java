package org.example;

public class Person {
    private String name;
    private String gender;
    private int age;

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + ".");
        System.out.println("I am " + gender + " and " + age + " years old.\n");
    }
}
