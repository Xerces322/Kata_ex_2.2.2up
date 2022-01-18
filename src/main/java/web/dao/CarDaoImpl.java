package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{
    private static final List<Car> cars;

    static {
        cars = new ArrayList<Car>();
        cars.add(new Car("Mitsubishi", "Lancer Evolution IX", 2006));
        cars.add(new Car("Subaru", "Impreza WRX STi", 2005));
        cars.add(new Car("Nissan", "Silvia", 2001));
        cars.add(new Car("Toyota", "Mark II VII", 1999));
        cars.add(new Car("Honda", "Integra Type R III", 2001));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }
    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, count);
    }
}
