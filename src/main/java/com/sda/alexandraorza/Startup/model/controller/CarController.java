package com.sda.alexandraorza.Startup.model.controller;

import com.sda.alexandraorza.Startup.model.car.Car;
import com.sda.alexandraorza.Startup.service.CarService;
import com.sda.alexandraorza.Startup.service.dto.CarDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService){
        this.carService = carService;
    }

    @GetMapping("/addcar")
    public String showAddCarPage(CarDTO car){
        return "addCar";
    }

    @PostMapping("/addcar")
    public String addCar(@Valid CarDTO car, BindingResult bindingResult, Model model){

        if(bindingResult.hasErrors()){
            return "addCar";
        }
        carService.addCar(car);

        // TO DO sa nu uitam sa populam modelul cand implementam list cars

        return "listcars";
    }
}
