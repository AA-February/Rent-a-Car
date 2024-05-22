package com.advance.academy.rentacar;

import com.advance.academy.rentacar.entity.Car;
import com.advance.academy.rentacar.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RentACarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentACarApplication.class, args);

	}

}
