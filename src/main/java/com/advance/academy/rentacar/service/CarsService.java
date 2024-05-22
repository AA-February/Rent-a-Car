package com.advance.academy.rentacar.service;

import com.advance.academy.rentacar.entity.Car;
import com.advance.academy.rentacar.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarsService {

    private CarsRepository carsRepository;

    @Autowired
    public CarsService(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }

    public void addCar(Car car) {
        this.carsRepository.save(car);
    }
}
