package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> showAllListCars(List<Car> cars) {
        return cars;
    }

    @Override
    public List<Car> showPartListCars(List<Car> cars, int count) {
        return count > 5 ? cars : cars.subList(0, count);
    }
}
