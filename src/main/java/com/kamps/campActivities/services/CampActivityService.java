package com.kamps.campActivities.services;


import com.kamps.campActivities.models.CampActivity;

import java.util.List;

public interface CampActivityService {
    List<CampActivity> getAllCampActivities();
    //CampActivity getCampActivityById(Integer id);
    CampActivity createCampActivity(CampActivity campActivity);
    //void deleteCampActivity(Integer id);
}
