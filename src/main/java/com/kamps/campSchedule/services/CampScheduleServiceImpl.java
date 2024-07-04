package com.kamps.campSchedule.services;



import com.kamps.campSchedule.models.CampSchedule;
import com.kamps.campSchedule.repository.CampScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampScheduleServiceImpl implements CampScheduleService {

    @Autowired
    private CampScheduleRepository campScheduleRepository;

    @Override
    public List<CampSchedule> getAllCampSchedules() {
        return campScheduleRepository.findAll();
    }

    @Override
    public CampSchedule createCampSchedule(CampSchedule campSchedule) {
        return campScheduleRepository.save(campSchedule);
    }

   /* @Override
    public CampSchedule getCampScheduleById(Integer id) {
        return campScheduleRepository.findById(id).orElse(null);
    }



    @Override
    public void deleteCampSchedule(Integer id) {
        campScheduleRepository.deleteById(id);
    }*/
}

