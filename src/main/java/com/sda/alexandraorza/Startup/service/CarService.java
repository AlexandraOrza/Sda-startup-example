package com.sda.alexandraorza.Startup.service;

import com.sda.alexandraorza.Startup.service.dto.CarDTO;

public interface CarService {

    /**
     * Create a new car for the given carDTO.
     *
     * @param carDTO, details of the new car
     * @return id of the newly created car
     */
    Long addCar(CarDTO carDTO);
}
