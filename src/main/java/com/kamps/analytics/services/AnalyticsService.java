package com.kamps.analytics.services;


import com.kamps.analytics.models.Analytics;

import java.util.List;

public interface AnalyticsService {

    Analytics createAnalyticsRecord(Analytics analytics);

    List<Analytics> getAllAnalyticsRecords();

    //Analytics getAnalyticsRecordById(Long recordID);

    // Add other service methods for update, delete, etc.
}