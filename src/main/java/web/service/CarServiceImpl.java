package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDaoImpl;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    private CarDaoImpl carDaoImpl;

    @Autowired
    public CarServiceImpl(CarDaoImpl carDaoImpl) {
        this.carDaoImpl = carDaoImpl;
    }

    @Override
    public List<Car> getCars(int count) {
        if (count > 0 && count < 5) {
            return carDaoImpl.getCars(count);
        }
        return carDaoImpl.getCars();
    }
}
