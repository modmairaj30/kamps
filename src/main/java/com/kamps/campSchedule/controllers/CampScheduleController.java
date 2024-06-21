package com.kamps.campSchedule.controllers;



import com.kamps.campSchedule.models.CampSchedule;
import com.kamps.campSchedule.services.CampScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/campSchedules")
public class CampScheduleController {

    @Autowired
    private CampScheduleService campScheduleService;

    @GetMapping
    public List<CampSchedule> getAllCampSchedules() {
        return campScheduleService.getAllCampSchedules();
    }

    @PostMapping("/CreateCampSchedule")
    public CampSchedule createCampSchedule(@RequestBody CampSchedule campSchedule) {
        return campScheduleService.createCampSchedule(campSchedule);
    }


   /* @GetMapping("/{id}")
    public CampSchedule getCampScheduleById(@PathVariable Integer id) {
        return campScheduleService.getCampScheduleById(id);
    }


    @PutMapping("/{id}")
    public CampSchedule updateCampSchedule(@PathVariable Integer id, @RequestBody CampSchedule campSchedule) {
        campSchedule.setScheduleId(id);
        return campScheduleService.createOrUpdateCampSchedule(campSchedule);
    }

    @DeleteMapping("/{id}")
    public void deleteCampSchedule(@PathVariable Integer id) {
        campScheduleService.deleteCampSchedule(id);
    }*/
}

