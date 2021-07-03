package com.sda.alexandraorza.Startup.repository;

import com.sda.alexandraorza.Startup.model.car.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

}
