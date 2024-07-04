package com.kamps.analytics.services;

import com.kamps.analytics.models.Analytics;
import com.kamps.analytics.repository.AnalyticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnalyticsServiceImpl implements AnalyticsService {

    @Autowired
    private AnalyticsRepository analyticsRepository;

    @Override
    public Analytics createAnalyticsRecord(Analytics analytics) {
        return analyticsRepository.save(analytics);
    }

    @Override
    public List<Analytics> getAllAnalyticsRecords() {
        return analyticsRepository.findAll();
    }

   /* @Override
    public Analytics getAnalyticsRecordById(Long recordID) {
        return analyticsRepository.findById(recordID).orElseThrow(() -> new RuntimeException("Analytics record not found"));
    }*/

    // Implement other service methods for update, delete, etc.
}
