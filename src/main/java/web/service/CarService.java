package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> showAllListCars();

    List<Car> showPartListCars(int count);
}
