package web.service;

import web.DAO.CarDao;
import web.DAO.CarDaoImpl;
import web.model.*;

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
