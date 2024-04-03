package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("LADA", "Zhiguli", 2101));
        cars.add(new Car("LADA", "Samara", 2115));
        cars.add(new Car("LADA", "110", 2110));
        cars.add(new Car("LADA", "Priora", 2170));
        cars.add(new Car("LADA", "Kalina", 117));
    }

    public List<Car> listCars() {
        return cars;
    }

}
