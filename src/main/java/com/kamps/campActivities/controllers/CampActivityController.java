package com.kamps.campActivities.controllers;



import com.kamps.campActivities.models.CampActivity;
import com.kamps.campActivities.services.CampActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/campActivities")
public class CampActivityController {

    @Autowired
    private CampActivityService campActivityService;

    @GetMapping
    public List<CampActivity> getAllCampActivities() {
        return campActivityService.getAllCampActivities();
    }

    @PostMapping("/create_CampActivity")
    public CampActivity createCampActivity(@RequestBody CampActivity campActivity) {
        return campActivityService.createCampActivity(campActivity);
    }


   /* @GetMapping("/{id}")
    public CampActivity getCampActivityById(@PathVariable Integer id) {
        return campActivityService.getCampActivityById(id);
    }



    @PutMapping("/{id}")
    public CampActivity updateCampActivity(@PathVariable Integer id, @RequestBody CampActivity campActivity) {
        campActivity.setCampActivityId(id);
        return campActivityService.createOrUpdateCampActivity(campActivity);
    }

    @DeleteMapping("/{id}")
    public void deleteCampActivity(@PathVariable Integer id) {
        campActivityService.deleteCampActivity(id);
    }*/
}

