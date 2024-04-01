package web.Service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> showAllListCars(List<Car> cars);

    List<Car> showPartListCars(List<Car> cars, int count);
}
