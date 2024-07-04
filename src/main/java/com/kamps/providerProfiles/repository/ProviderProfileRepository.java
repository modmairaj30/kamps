package com.kamps.providerProfiles.repository;



import com.kamps.providerProfiles.models.ProviderProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderProfileRepository extends JpaRepository<ProviderProfile, Integer> {
}

