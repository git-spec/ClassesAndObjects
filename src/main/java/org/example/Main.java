package org.example;

public class Main {
    public static void main(String[] args) {
        // Vehicle
        Vehicle Plane = new Vehicle("Airbus", "plane", 2024);
        System.out.println(Plane);
        // Golf 1
        Car Golf_1 = new Car("VW", "car", "VW", "Golf", "black", 2025);
        Golf_1.startCar();
        System.out.println(Golf_1);
        // Golf 2
        Car Golf_2 = new Car("VW", "car","VW", "Golf", "white", 2023);
        System.out.println(Golf_2.getSpeed());
        Golf_2.setSpeed(60);
        System.out.println(Golf_2.getSpeed());
        Motorcycle Bike = new Motorcycle("FIAT", "bike", 2006, "Ducati", "GT 1000 Classic", "silver");
        System.out.println(Bike);
        // POLYMORPHISM
        Vehicle[] vehicles = {Plane, Golf_1, Golf_2};
        // Persons
        Person Jack = new Person("Jack", "male", 26);
        Jack.introduce();
        Person Yumi = new Person("Yumi", "female", 18);
        Yumi.introduce();
        Person Mathilde = new Person("Mathilde", "female", 96);
        Mathilde.introduce();
    }
}