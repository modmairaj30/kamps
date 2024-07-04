package com.kamps.providerProfiles.services;


import com.kamps.providerProfiles.models.ProviderProfile;

import java.util.List;

public interface ProviderProfileService {

    List<ProviderProfile> getAllProviderProfiles();
    //ProviderProfile getProviderProfileById(Integer id);
    ProviderProfile createProviderProfile(ProviderProfile providerProfile);
    //void deleteProviderProfile(Integer id);
}

