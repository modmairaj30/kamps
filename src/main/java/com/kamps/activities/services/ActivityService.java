package com.kamps.activities.services;

import com.kamps.activities.models.Activity;

import java.util.List;

public interface  ActivityService {
    List<Activity> getAllActivities();
    //Activity getActivityById(Integer id);
    Activity createOrUpdateActivity(Activity activity);
    //void deleteActivity(Integer id);
}

