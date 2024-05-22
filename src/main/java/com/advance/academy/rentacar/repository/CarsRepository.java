package com.advance.academy.rentacar.repository;

import com.advance.academy.rentacar.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsRepository extends JpaRepository<Car,Long> {
}
