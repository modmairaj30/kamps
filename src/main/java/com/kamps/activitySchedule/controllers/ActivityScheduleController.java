package com.kamps.activitySchedule.controllers;

import com.kamps.activitySchedule.models.ActivitySchedule;
import com.kamps.activitySchedule.services.ActivityScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedules")
public class ActivityScheduleController {

    @Autowired
    private ActivityScheduleService activityScheduleService;

    @GetMapping
    public List<ActivitySchedule> getAllSchedules() {
        return activityScheduleService.getAllSchedules();
    }

    @PostMapping("/create/schedule")
    public ActivitySchedule createSchedule(@RequestBody ActivitySchedule schedule) {
        return activityScheduleService.createSchedule(schedule);
    }

    /*@GetMapping("/{id}")
    public ActivitySchedule getScheduleById(@PathVariable Integer id) {
        return activityScheduleService.getScheduleById(id);
    }

    @PostMapping
    public ActivitySchedule createSchedule(@RequestBody ActivitySchedule schedule) {
        return activityScheduleService.createOrUpdateSchedule(schedule);
    }

    @PutMapping("/{id}")
    public ActivitySchedule updateSchedule(@PathVariable Integer id, @RequestBody ActivitySchedule schedule) {
        schedule.setScheduleId(id);
        return activityScheduleService.createOrUpdateSchedule(schedule);
    }

    @DeleteMapping("/{id}")
    public void deleteSchedule(@PathVariable Integer id) {
        activityScheduleService.deleteSchedule(id);
    }*/
}

