package com.kamps.camps.services;



import com.kamps.camps.models.Camp;

import java.util.List;

public interface CampService {
    List<Camp> getAllCamps();
    //Camp getCampById(Integer id);
    Camp createCamp(Camp camp);
    //void deleteCamp(Integer id);
}

