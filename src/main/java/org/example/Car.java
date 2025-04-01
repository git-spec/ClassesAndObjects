package org.example;

import java.util.Objects;


/** INHERITANCE **/
public class Car extends Vehicle {
    private final String brand;
    private final String model;
    private String color;
    private int speed;

    public Car(String manufacturer, String type, String brand, String model, String color, int year) {
        super(manufacturer, type, year);
        this.model = model;
        this.brand = brand;
        this.color = color;
    }

    // GETTER
    public String getBrand() {
        return brand;
    }
    public String getModel() { return model; }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return super.getYear();
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
                "manufacturer='" + getManufacturer() + '\'' +
                ", type='" + getType() + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + super.getYear() +
                '}';
    }

    public void startCar() {
        System.out.println(this.model + " has been started.");
    }


}
