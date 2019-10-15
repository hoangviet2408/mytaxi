package edu.gw.spring.crud.crudtaxi.controller;

import edu.gw.spring.crud.crudtaxi.ResourceNotFoundException;
import edu.gw.spring.crud.crudtaxi.model.Driver;
import edu.gw.spring.crud.crudtaxi.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ControllerDriver {

    @Autowired
    DriverRepository driverRepository;

    @GetMapping("/drivers")
    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }
    // Create a new Note

    @PostMapping("/drivers")
    public Driver creatDriver(@Valid @RequestBody Driver driver){
        return driverRepository.save(driver);
    }
    @GetMapping("drivers/{id}")
    public Driver getDriverById(@PathVariable(value = "id" ) Long drID){
        return driverRepository.findById(drID)
                .orElseThrow(() -> new ResourceNotFoundException("Driver", "drID" , drID));
    }

    @PutMapping("/drivers/{id}")
    public Driver updateDriver(@PathVariable(value = "id") Long drID,
                               @Valid @RequestBody Driver driverDetails){

        Driver driver = driverRepository.findById(drID)
                .orElseThrow(() -> new ResourceNotFoundException("Driver" , "drID", drID));
        driver.setDrName((driverDetails.getDrName()));
        driver.setDrAge((driverDetails.getDrAge()));
        driver.setDrPhone((driverDetails.getDrPhone()));
        driver.setDrAddress((driverDetails.getDrAddress()));
        Driver updateDriver = driverRepository.save(driver);
        return updateDriver;
    }
    @DeleteMapping("/drivers/{id}")
    public ResponseEntity<?> deleteDriver(@PathVariable(value = "id") Long drID){
        Driver driver = driverRepository.findById(drID)
                .orElseThrow(() -> new ResourceNotFoundException("Driver", "drID", drID));
        driverRepository.delete(driver);
        return ResponseEntity.ok().build();
    }
}