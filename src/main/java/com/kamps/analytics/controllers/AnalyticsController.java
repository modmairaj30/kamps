package com.kamps.analytics.controllers;


import com.kamps.analytics.models.Analytics;
import com.kamps.analytics.services.AnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/analytics")
public class AnalyticsController {

    @Autowired
    private AnalyticsService analyticsService;


    @GetMapping
    public ResponseEntity<List<Analytics>> getAllAnalyticsRecords() {
        return new ResponseEntity<>(analyticsService.getAllAnalyticsRecords(), HttpStatus.OK);
    }


    @PostMapping("/createAnalytics")
    public ResponseEntity<Analytics> createAnalyticsRecord(@RequestBody Analytics analytics) {
        return new ResponseEntity<>(analyticsService.createAnalyticsRecord(analytics), HttpStatus.CREATED);
    }


    /*@GetMapping("/{recordID}")
    public ResponseEntity<Analytics> getAnalyticsRecordById(@PathVariable Long recordID) {
        return new ResponseEntity<>(analyticsService.getAnalyticsRecordById(recordID), HttpStatus.OK);
    }*/

    // Add other controller methods for update, delete, etc.
}