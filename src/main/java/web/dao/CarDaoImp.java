package web.dao;

import web.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    private final static List<Car> allCars = new ArrayList<>();
    public static List<Car> getAllCars() {
        allCars.add(new Car(1, "Car 1", 111));
        allCars.add(new Car(2, "Car 2", 222));
        allCars.add(new Car(3, "Car 3", 333));
        allCars.add(new Car(4, "Car 4", 444));
        allCars.add(new Car(5, "Car 5", 555));
        allCars.add(new Car(6, "Car 6", 666));
        allCars.add(new Car(7, "Car 7", 777));
        List<Car> cars = allCars;
        return cars;
    }
}
