package com.kamps.camps.services;



import com.kamps.camps.models.Camp;
import com.kamps.camps.repository.CampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampServiceImpl implements CampService {

    @Autowired
    private CampRepository campRepository;

    @Override
    public List<Camp> getAllCamps() {
        return campRepository.findAll();
    }

    @Override
    public Camp createCamp(Camp camp) {
        return campRepository.save(camp);
    }

   /* @Override
    public Camp getCampById(Integer id) {
        return campRepository.findById(id).orElse(null);
    }



    @Override
    public void deleteCamp(Integer id) {
        campRepository.deleteById(id);
    }*/
}

