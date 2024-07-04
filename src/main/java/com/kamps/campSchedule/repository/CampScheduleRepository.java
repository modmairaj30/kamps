package com.kamps.campSchedule.repository;



import com.kamps.campSchedule.models.CampSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampScheduleRepository extends JpaRepository<CampSchedule, Integer> {
}

