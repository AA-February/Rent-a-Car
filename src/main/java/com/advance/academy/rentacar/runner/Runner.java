package com.advance.academy.rentacar.runner;

import com.advance.academy.rentacar.entity.Car;
import com.advance.academy.rentacar.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private CarsService carsService;

    @Override
    public void run(String... args) throws Exception {
        Car car = new Car(1L,"BMW","BMW","325",1923,"B4352HP");

        this.carsService.addCar(car);
    }
}
