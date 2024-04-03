package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDAO carDAO;

    @Override
    public List<Car> showAllListCars() {
        return carDAO.listCars();
    }

    @Override
    public List<Car> showPartListCars(int count) {
        if (count < 0) {
            return null;
        } else {
        return count > 5 ? carDAO.listCars() : carDAO.listCars().subList(0, count);
        }
    }
}
