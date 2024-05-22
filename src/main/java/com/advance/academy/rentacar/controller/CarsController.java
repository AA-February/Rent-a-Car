package com.advance.academy.rentacar.controller;

import com.advance.academy.rentacar.entity.Car;
import com.advance.academy.rentacar.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarsController {
    @Autowired
    CarsService carsService;

    @GetMapping
    public String hello(){
        return "Hello world!";
    }

    @PostMapping
    public Car saveCar(@RequestBody Car car){
        return carsService.addCar(car);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> getById(@PathVariable("id") long carId){
        Optional<Car> result =  carsService.findCar(carId);
        if(result.isEmpty()){
           return null;
        }else {
            return ResponseEntity.of(result);
        }
    }
}
