package edu.gw.spring.crud.crudtaxi.controller;

import edu.gw.spring.crud.crudtaxi.ResourceNotFoundException;
import edu.gw.spring.crud.crudtaxi.model.Car;
import edu.gw.spring.crud.crudtaxi.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ControllerCar {



    @Autowired
    CarRepository carRepository;

    @GetMapping("/cars")
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }
    // Create a new Note

    @PostMapping("/cars")
    public Car createCar(@Valid @RequestBody Car car) {
        return carRepository.save(car);
    }
    // Get a Single Note

    @GetMapping("/cars/{id}")
    public Car getCarById(@PathVariable(value = "id") Long carID) {
        return carRepository.findById(carID)
                .orElseThrow(() -> new ResourceNotFoundException("Car", "carID", carID ));
    }
    // Update a Note
    @PutMapping("/cars/{id}")
    public Car updateCar(@PathVariable(value = "id") Long carID,
                         @Valid @RequestBody Car carDetails) {

        Car car = carRepository.findById(carID)
                .orElseThrow(() -> new ResourceNotFoundException("Car", "carID", carID));

        car.setCarNo(carDetails.getCarNo());
        car.setLicense_plate(carDetails.getLicense_plate());
        car.setSeat_count(carDetails.getSeat_count());
        car.setRating(carDetails.getRating());
        car.setEnergy_type(carDetails.getEnergy_type());
        car.setMfID(carDetails.getMfID());
        car.setDrID(carDetails.getDrID());

        Car updateCar = carRepository.save(car);
        return updateCar;
    }
    // Delete a Note
    @DeleteMapping("/cars/{id}")
    public ResponseEntity<?> deleteCar(@PathVariable(value = "id") Long id){
        Car car = carRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Car", "id", id));
        carRepository.delete(car);
        return ResponseEntity.ok().build();
    }

    @GetMapping("getForm")
    public String getForn(){
        return "carForm";
    }
    @PostMapping("/saveDetails")
    public String saveDetails(@RequestParam("carID") Long id,
                              @RequestParam("carNo") String carNo,
                              @RequestParam("license_plate") String license_plate,
                              @RequestParam("seat_count") String seat_count,
                              @RequestParam("rating") String rating,
                              @RequestParam("energy_type") String energy_type,
                              @RequestParam("mfID") Long mfID,
                              @RequestParam("driverID") Long drID,
                                      ModelMap modelMap){
        // write your code to save details
        modelMap.put("carID", id);
        modelMap.put("carNo", carNo);
        modelMap.put("license_plate", license_plate);
        modelMap.put("seat_count", seat_count);
        modelMap.put("rating", rating);
        modelMap.put("energy_type", energy_type);
        modelMap.put("mfID", mfID);
        modelMap.put("driverID", drID);
        return "viewDetails";
    }

}
