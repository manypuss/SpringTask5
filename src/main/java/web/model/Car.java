package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    String brand;
    String model;
    int series;

    public Car(String brand, String model, int series) {
        this.brand = brand;
        this.model = model;
        this.series = series;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public static List<Car> listCar() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("LADA", "Zhiguli", 2101));
        cars.add(new Car("LADA", "Samara", 2115));
        cars.add(new Car("LADA", "110", 2110));
        cars.add(new Car("LADA", "Priora", 2170));
        cars.add(new Car("LADA", "Kalina", 117));
        return cars;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
