package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService {

    private final List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("BMW", 45, "Blue"));
        carList.add(new Car("Audi", 40, "Red"));
        carList.add(new Car("Honda", 30, "Green"));
        carList.add(new Car("Toyota", 20, "Yellow"));
        carList.add(new Car("Chery", 10, "Blue"));
    }


    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
