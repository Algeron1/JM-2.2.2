package web.controller;

import web.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.model.*;

import java.util.List;


@Controller
public class CarController {

    CarServiceImpl carService = new CarServiceImpl();

    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public String printCars(ModelMap model) {
        List<Car> cars = carService.listCars();
        model.addAttribute("cars", cars);
        return "cars";
    }



}