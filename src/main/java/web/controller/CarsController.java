package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


import java.util.Optional;

@Controller
public class CarsController {

    @Autowired
    CarService service;
    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(name = "count", required = false) Optional<Integer> count, ModelMap model) {
        model.addAttribute("cars", service.getAllCars(count.orElse(0)).toString());
        return "cars";
    }
}
