package com.kamps.camps.repository;



import com.kamps.camps.models.Camp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampRepository extends JpaRepository<Camp, Integer> {
}

