package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.List;
import java.util.Optional;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count") Optional<Integer> count, ModelMap model) {
        CarService carService = new CarServiceImp();
        List<Car> carList = carService.getCars(count.orElse(0));
        model.addAttribute("cars", carList);
        return "car";
    }

}