package service;

import dao.CarDaoImp;
import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    CarDaoImp carDao = new CarDaoImp();

    @Override
    public ArrayList<Car> getCars(int count) {
        if (count == 0 || count >= 5) {
            return carDao.getCar();
        } else {
            return carDao.getCar().stream().limit(count).collect(Collectors.toCollection(ArrayList::new));
        }
    }
}