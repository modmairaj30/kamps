package com.kamps.campActivities.repository;



import com.kamps.campActivities.models.CampActivity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampActivityRepository extends JpaRepository<CampActivity, Integer> {
}
