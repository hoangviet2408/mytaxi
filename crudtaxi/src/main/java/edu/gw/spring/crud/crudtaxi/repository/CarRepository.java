package edu.gw.spring.crud.crudtaxi.repository;

import edu.gw.spring.crud.crudtaxi.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
