package com.kamps.activitySchedule.repository;

import com.kamps.activitySchedule.models.ActivitySchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityScheduleRepository extends JpaRepository<ActivitySchedule, Integer> {
}

