package com.sda.alexandraorza.Startup.service.impl;

import com.sda.alexandraorza.Startup.model.car.Car;
import com.sda.alexandraorza.Startup.repository.CarRepository;
import com.sda.alexandraorza.Startup.service.CarService;
import com.sda.alexandraorza.Startup.service.dto.CarDTO;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    @Override
    @Transactional
    public Long addCar(CarDTO carDTO){
        Car car = convertToCar(carDTO);
        carRepository.save(car);
        return car.getId();
    }

    public Car convertToCar(CarDTO carDTO){
        Car car = new Car();
        car.setBrand(carDTO.getBrand());
        car.setCarType(carDTO.getCarType());
        car.setModel(carDTO.getModel());
        car.setProductDate(carDTO.getProductDate());
        car.setHp(carDTO.getHp());
        return car;
    }
}
