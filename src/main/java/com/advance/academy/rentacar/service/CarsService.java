package com.advance.academy.rentacar.service;

import com.advance.academy.rentacar.entity.Car;
import com.advance.academy.rentacar.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarsService {

    private CarsRepository carsRepository;

    @Autowired
    public CarsService(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }

    public Car addCar(Car car) {
        //
       return this.carsRepository.save(car);
    }

    public Optional<Car> findCar(long id){
        return this.carsRepository.findById(id);
    }

}
