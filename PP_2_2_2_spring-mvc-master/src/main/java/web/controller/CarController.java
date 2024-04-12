package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarServiceImpl car;

    @Autowired
    public CarController(CarServiceImpl car) {
        this.car = car;
    }



    @GetMapping()
    public String printCar(ModelMap model, @RequestParam(value = "count", required = false) String count) {
        if (count == null) {
            model.addAttribute("messages", car.getCars());
        } else {
            model.addAttribute("messages", car.number(Integer.parseInt(count)));
        }
        return "cars";
    }



}
