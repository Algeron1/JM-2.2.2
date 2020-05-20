package web.controller;

import hiber.service.CarServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import hiber.model.Car;

import java.util.List;


@Controller
@RequestMapping("/")
public class CarController {

    CarServiceImpl carService = new CarServiceImpl();

    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public String printCars(ModelMap model) {
        List<Car> cars = carService.listCars();
        model.addAttribute("cars", cars);
        return "cars";
    }

}