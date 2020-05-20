package hiber.service;

import hiber.DAO.CarDao;
import hiber.DAO.CarDaoImpl;
import hiber.model.Car;

import java.util.List;

public class CarServiceImpl implements CarDao {


    private final CarDao carDao;

    public CarServiceImpl() {
        this.carDao = new CarDaoImpl();
    }

    public void add(Car car) {
        carDao.add(car);
    }

    public List<Car> listCars() {
        return carDao.listCars();
    }
}
