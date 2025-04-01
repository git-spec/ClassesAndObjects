package org.example;

public class Vehicle {
    private final String manufacturer;
    private final  String type;
    private final int year;

    public Vehicle(String manufacturer, String type, int year) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                ", year=" + year +
                '}';
    }
}
