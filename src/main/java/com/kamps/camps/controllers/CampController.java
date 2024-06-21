package com.kamps.camps.controllers;



import com.kamps.camps.models.Camp;
import com.kamps.camps.services.CampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/camps")
public class CampController {

    @Autowired
    private CampService campService;

    @GetMapping
    public List<Camp> getAllCamps() {
        return campService.getAllCamps();
    }

    @PostMapping("/createCamps")
    public Camp createCamp(@RequestBody Camp camp) {

        return campService.createCamp(camp);
    }

    /*@GetMapping("/{id}")
    public Camp getCampById(@PathVariable Integer id) {
        return campService.getCampById(id);
    }



    @PutMapping("/{id}")
    public Camp updateCamp(@PathVariable Integer id, @RequestBody Camp camp) {
        camp.setCampId(id);
        return campService.createOrUpdateCamp(camp);
    }

    @DeleteMapping("/{id}")
    public void deleteCamp(@PathVariable Integer id) {
        campService.deleteCamp(id);
    }*/
}

