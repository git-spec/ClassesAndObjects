package org.example;

import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private String color;
    private final int year;
    private int speed;

    public Car(String brand, String model, String color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // GETTER
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
    public int getSpeed() {
        return speed;
    }

    // SETTER
    public void setColor(String color) {
        this.color = color;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getYear() == car.getYear() && Objects.equals(getBrand(), car.getBrand()) && Objects.equals(getModel(), car.getModel()) && Objects.equals(getColor(), car.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getColor(), getYear());
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public void startCar() {
        System.out.println(this.model + " has been started.");
    }


}
