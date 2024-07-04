package com.kamps.activities.services;

import com.kamps.activities.models.Activity;
import com.kamps.activities.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    @Override
    public List<Activity> getAllActivities() {
        return activityRepository.findAll();
    }


    @Override
    public Activity createOrUpdateActivity(Activity activity) {
        return activityRepository.save(activity);
    }

   /* @Override
    public Activity getActivityById(Integer id) {
        return activityRepository.findById(id).orElse(null);
    }



    @Override
    public void deleteActivity(Integer id) {
        activityRepository.deleteById(id);
    }*/
}

