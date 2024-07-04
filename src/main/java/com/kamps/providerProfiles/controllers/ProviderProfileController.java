package com.kamps.providerProfiles.controllers;




import com.kamps.providerProfiles.models.ProviderProfile;
import com.kamps.providerProfiles.services.ProviderProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/providerProfiles")
public class ProviderProfileController {

    @Autowired
    private ProviderProfileService providerProfileService;

    @GetMapping
    public List<ProviderProfile> getAllProviderProfiles() {
        return providerProfileService.getAllProviderProfiles();
    }

    @PostMapping
    public ProviderProfile createProviderProfile(@RequestBody ProviderProfile providerProfile) {
        return providerProfileService.createProviderProfile(providerProfile);
    }


   /* @GetMapping("/{id}")
    public ProviderProfile getProviderProfileById(@PathVariable Integer id) {
        return providerProfileService.getProviderProfileById(id);
    }



    @PutMapping("/{id}")
    public ProviderProfile updateProviderProfile(@PathVariable Integer id, @RequestBody ProviderProfile providerProfile) {
        providerProfile.setProviderId(id);
        return providerProfileService.createOrUpdateProviderProfile(providerProfile);
    }

    @DeleteMapping("/{id}")
    public void deleteProviderProfile(@PathVariable Integer id) {
        providerProfileService.deleteProviderProfile(id);
    }*/
}

