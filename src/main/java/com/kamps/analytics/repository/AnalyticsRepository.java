package com.kamps.analytics.repository;


import com.kamps.analytics.models.Analytics;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnalyticsRepository extends JpaRepository<Analytics, Long> {
}