package com.kamps.campActivities.services;



import com.kamps.campActivities.models.CampActivity;

import com.kamps.campActivities.repository.CampActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampActivityServiceImpl implements CampActivityService {

    @Autowired
    private CampActivityRepository campActivityRepository;

    @Override
    public List<CampActivity> getAllCampActivities() {
        return campActivityRepository.findAll();
    }

    @Override
    public CampActivity createCampActivity(CampActivity campActivity) {
        return campActivityRepository.save(campActivity);
    }


   /* @Override
    public CampActivity getCampActivityById(Integer id) {
        return campActivityRepository.findById(id).orElse(null);
    }



    @Override
    public void deleteCampActivity(Integer id) {
        campActivityRepository.deleteById(id);
    }*/
}

