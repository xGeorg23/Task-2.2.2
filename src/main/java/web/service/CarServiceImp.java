package web.service;

import web.dao.CarDao;
import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getAllCars(int count) {
        if (count == 0 || count >= 5) {
            return carDao.getAllCars();
        } else {
            return carDao.getAllCars().stream().limit(count).collect(Collectors.toCollection(ArrayList::new));
        }
    }
}
