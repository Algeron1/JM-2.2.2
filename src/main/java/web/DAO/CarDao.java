package web.DAO;

import web.model.*;

import java.util.List;

public interface CarDao {
    void add(Car car);

    List<Car> listCars();
}
