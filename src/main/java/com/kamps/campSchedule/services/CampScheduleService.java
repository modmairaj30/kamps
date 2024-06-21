package com.kamps.campSchedule.services;



import com.kamps.campSchedule.models.CampSchedule;

import java.util.List;

public interface CampScheduleService {
    List<CampSchedule> getAllCampSchedules();
   // CampSchedule getCampScheduleById(Integer id);
    CampSchedule createCampSchedule(CampSchedule campSchedule);
    //void deleteCampSchedule(Integer id);
}

