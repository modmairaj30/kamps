package com.kamps.activities.controllers;

import com.kamps.activities.models.Activity;
import com.kamps.activities.payload.ActivityResponse;
import com.kamps.activities.services.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activities")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @GetMapping
    public List<Activity> getAllActivities() {
        return activityService.getAllActivities();
    }

   /* @PostMapping("/create")
    public Activity createActivity(@RequestBody Activity activity) {
        return activityService.createOrUpdateActivity(activity);
    }*/


   /* @PostMapping("/create")
    public ActivityResponse createActivity(@RequestBody Activity activity) {
        Activity createdActivity = activityService.createOrUpdateActivity(activity);
        return new ActivityResponse("Data Successfully", createdActivity);
    }*/

    @PostMapping("/create")
    public ResponseEntity<String> createActivity(@RequestBody Activity activity) {
        activityService.createOrUpdateActivity(activity);
        return ResponseEntity.ok("Data Successfully");

    /*@GetMapping("/{id}")
    public Activity getActivityById(@PathVariable Integer id) {
        return activityService.getActivityById(id);
    }



    @PutMapping("/{id}")
    public Activity updateActivity(@PathVariable Integer id, @RequestBody Activity activity) {
        activity.setActivityId(id);
        return activityService.createOrUpdateActivity(activity);
    }

    @DeleteMapping("/{id}")
    public void deleteActivity(@PathVariable Integer id) {
        activityService.deleteActivity(id);
    }*/
    }}

