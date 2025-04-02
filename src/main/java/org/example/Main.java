package org.example;

public class Main {
    public static void main(String[] args) {
        /** INHERITANCE VS COMPOSITION **/
        // Vehicle
        Vehicle Plane = new Vehicle("Airbus", "plane", 2024);
        System.out.println(Plane + "\n");
        // Golf 1
        Car Golf_1 = new Car("VW", "car", "VW", "Golf", "black", 2025);
        Golf_1.startCar();
        System.out.println(Golf_1);
        // Golf 2
        Car Golf_2 = new Car("VW", "car","VW", "Golf", "white", 2023);
        System.out.println("actual speed of Golf: " + Golf_2.getSpeed());
        Golf_2.setSpeed(60);
        System.out.println("accelerated speed of Golf: " + Golf_2.getSpeed() + "\n");
        Motorcycle Bike_1 = new Motorcycle("FIAT", "bike", 2006, "Ducati", "GT 1000 Classic", "silver");
        Motorcycle Bike_2 = new Motorcycle("Triumph", "bike", 1972, "Triumph", "Bonneville T120", "gold");
        System.out.println(Bike_1);
        System.out.println(Bike_2 + "\n");
        // POLYMORPHISM
        Vehicle[] vehicles = {Plane, Golf_1, Golf_2};
        // Static numbers
        Bike_2.setInstanceNumber(2);
        Bike_1.setInstanceNumber(1);
        Car.setNumber(6);
        System.out.println("Numbers of Ducati: " + Bike_1.getInstanceNumber());
        System.out.println("Numbers of Triumph: " + Bike_2.getInstanceNumber());
        System.out.println("Numbers of motorcycles: " + Motorcycle.getNumber());
        System.out.println("Numbers of cars: " + Car.number);
        System.out.println("Numbers of vehicles: " + Vehicle.number + "\n");
        // Persons
        Person Jack = new Person("Jack", "male", 26);
        Jack.introduce();
        Person Yumi = new Person("Yumi", "female", 18);
        Yumi.introduce();
        Person Mathilde = new Person("Mathilde", "female", 96);
        Mathilde.introduce();
        /** INTERFACE **/
        Playable[] playables = {new MusicPlayer(), new VideoPlayer()};
        MediaController controller = new MediaController();
        for (Playable playable : playables) {
            controller.playMedia(playable);
        }
    }
}