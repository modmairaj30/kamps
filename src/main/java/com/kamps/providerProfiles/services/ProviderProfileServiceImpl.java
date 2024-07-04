package com.kamps.providerProfiles.services;



import com.kamps.providerProfiles.models.ProviderProfile;
import com.kamps.providerProfiles.repository.ProviderProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderProfileServiceImpl implements ProviderProfileService {

    @Autowired
    private ProviderProfileRepository providerProfileRepository;

    @Override
    public List<ProviderProfile> getAllProviderProfiles() {
        return providerProfileRepository.findAll();
    }

    @Override
    public ProviderProfile createProviderProfile(ProviderProfile providerProfile) {
        return providerProfileRepository.save(providerProfile);
    }

    /*@Override
    public ProviderProfile getProviderProfileById(Integer id) {
        return providerProfileRepository.findById(id).orElse(null);
    }



    @Override
    public void deleteProviderProfile(Integer id) {
        providerProfileRepository.deleteById(id);
    }*/
}

