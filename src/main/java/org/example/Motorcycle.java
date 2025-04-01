package org.example;


/** COMPOSITION **/
public class Motorcycle {
    private static int number;
    private int instanceNumber;
    private final Vehicle vehicle;
    private final String brand;
    private final String model;
    private String color;

    public Motorcycle(String manufacturer, String type, int year, String brand, String model, String color) {
        this.vehicle = new Vehicle(manufacturer, type, year);
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public static void setNumber(int number) {
        Motorcycle.number += number;
        Vehicle.setNumber(number);
    }

    public void setInstanceNumber(int number) {
        instanceNumber = number;
        Motorcycle.number += number;
        Vehicle.setNumber(number);
    }

    // GETTER
    public static int getNumber() {
        return number;
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }

    public String getManufacturer() {
        return vehicle.getManufacturer();
    }

    public String getType() {
        return vehicle.getType();
    }

    public int getYear() {
        return vehicle.getYear();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    // SETTER
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "manufacturer='" + vehicle.getManufacturer() + '\'' +
                ", type='" + vehicle.getType() + '\'' +
                ", year='" + vehicle.getYear() + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
