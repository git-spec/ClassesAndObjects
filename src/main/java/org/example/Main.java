package org.example;

public class Main {
    public static void main(String[] args) {
        // Golf 1
        Car Golf_1 = new Car("VW", "car", "VW", "Golf", "black", 2025);
        Golf_1.startCar();
        System.out.println(Golf_1);
        // Golf 2
        Car Golf_2 = new Car("VW", "car","VW", "Golf", "white", 2023);
        System.out.println(Golf_2.getSpeed());
        Golf_2.setSpeed(60);
        System.out.println(Golf_2.getSpeed());
        // Persons
        Person Jack = new Person("Jack", "male", 26);
        Jack.introduce();
        Person Yumi = new Person("Yumi", "female", 18);
        Yumi.introduce();
        Person Mathilde = new Person("Mathilde", "female", 96);
        Mathilde.introduce();
    }
}