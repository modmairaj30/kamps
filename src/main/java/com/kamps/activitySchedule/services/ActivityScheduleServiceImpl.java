package com.kamps.activitySchedule.services;

import com.kamps.activitySchedule.models.ActivitySchedule;
import com.kamps.activitySchedule.repository.ActivityScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityScheduleServiceImpl implements ActivityScheduleService {

    @Autowired
    private ActivityScheduleRepository activityScheduleRepository;

    @Override
    public List<ActivitySchedule> getAllSchedules() {
        return activityScheduleRepository.findAll();
    }


    @Override
    public ActivitySchedule createSchedule(ActivitySchedule schedule) {
        return activityScheduleRepository.save(schedule);
    }

   /* @Override
    public ActivitySchedule getScheduleById(Integer id) {
        return activityScheduleRepository.findById(id).orElse(null);
    }


    @Override
    public void deleteSchedule(Integer id) {
        activityScheduleRepository.deleteById(id);
    }*/
}

