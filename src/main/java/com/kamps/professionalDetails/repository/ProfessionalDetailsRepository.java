package com.kamps.professionalDetails.repository;

import com.kamps.professionalDetails.models.ProfessionalDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessionalDetailsRepository extends JpaRepository<ProfessionalDetails,Integer> {
}
