package web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import web.service.*;
import java.util.Locale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.model.*;

import java.util.List;


@Controller
@RequestMapping(value = "/cars")
public class CarController {

    CarServiceImpl carService = new CarServiceImpl();

    @GetMapping
    public String printCars(ModelMap model) {
        List<Car> cars = carService.listCars();
        model.addAttribute("cars", cars);
        return "cars";
    }
}