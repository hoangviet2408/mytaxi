package edu.gw.spring.crud.crudtaxi.controller;

import edu.gw.spring.crud.crudtaxi.ResourceNotFoundException;
import edu.gw.spring.crud.crudtaxi.model.Menufacture;
import edu.gw.spring.crud.crudtaxi.repository.MenufactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    MenufactureRepository menufactureRepository;

    // Get All Notes
// Get All Notes
    @GetMapping("/menus")
    public List<Menufacture> getAllMenufactures() {
        return menufactureRepository.findAll();
    }
    // Create a new Note
    @PostMapping("/menus")
    public Menufacture createMenuFacture(@Valid @RequestBody Menufacture menufacture) {
        return menufactureRepository.save(menufacture);
    }
    // Get a Single Note
    @GetMapping("/menus/{id}")
    public Menufacture getMenuFactureById(@PathVariable(value = "id") Long mfID) {
        return menufactureRepository.findById(mfID)
                .orElseThrow(() -> new ResourceNotFoundException("Menufacture", "mfID", mfID ));
    }
    // Update a Note
    @PutMapping("/menus/{id}")
    public Menufacture updateMenuFacture(@PathVariable(value = "id") Long mfID,
                           @Valid @RequestBody Menufacture menufactureDetails) {

        Menufacture menufacture = menufactureRepository.findById(mfID)
                .orElseThrow(() -> new ResourceNotFoundException("Menufacture", "mfID", mfID));

        menufacture.setMfName(menufactureDetails.getMfName());
        menufacture.setMfCode(menufactureDetails.getMfCode());

        Menufacture updateMenufacture = menufactureRepository.save(menufacture);
        return updateMenufacture;
    }
    // Delete a Note
    @DeleteMapping("/menus/{id}")
    public ResponseEntity<?> deleteMenufacture(@PathVariable(value = "id") Long mfID) {
        Menufacture menufacture = menufactureRepository.findById(mfID)
                .orElseThrow(() -> new ResourceNotFoundException("Menufacture", "mfID", mfID));

        menufactureRepository.delete(menufacture);

        return ResponseEntity.ok().build();
    }
    //================================        Driver     ====================================

}
