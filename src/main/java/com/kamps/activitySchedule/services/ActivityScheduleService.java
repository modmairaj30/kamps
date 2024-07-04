package com.kamps.activitySchedule.services;

import com.kamps.activitySchedule.models.ActivitySchedule;

import java.util.List;

public interface ActivityScheduleService {
    List<ActivitySchedule> getAllSchedules();
   // ActivitySchedule getScheduleById(Integer id);
    ActivitySchedule createSchedule(ActivitySchedule schedule);
    //void deleteSchedule(Integer id);*/
}

