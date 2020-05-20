package hiber.DAO;

import hiber.model.Car;
import hiber.util.DBHelper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;


public class CarDaoImpl implements CarDao {

    private final SessionFactory sessionFactory;

    public CarDaoImpl() {
        this.sessionFactory = DBHelper.getSessionFactory();
    }

    @Override
    public void add(Car car) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(car);
        tx1.commit();
        session.close();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Car> listCars() {
        Session session = sessionFactory.openSession();
        List<Car> cars = (List<Car>) session.createQuery("From Car").list();
        session.close();
        return cars;
    }
}
