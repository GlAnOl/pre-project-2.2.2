package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class CarServiceImpl implements CarService {


    private List<Car> car;

    {
        car = new ArrayList<>();

        car.add(new Car("Lada", "Farhat", 1));
        car.add(new Car("Tayota", "Dima", 2));
        car.add(new Car("Subaru", "Artem", 3));
        car.add(new Car("BMW", "Egor", 4));
        car.add(new Car("Jeep", "Slava", 5));
    }

    @Override
    public List<Car> getCars() {
        return car;
    }

    public Car getCarBynNumber(int number) {
        return car.stream().filter(cars -> cars.getNumber() == number).findAny().orElse(null);
    }

    public List<Car> number(int count) {
        if (count >= 5) {
            return car;
        }
        return car.stream()
                .limit(count)
                .collect(Collectors.toList());
    }


}
