package com.kamps.reviews.controllers;


import com.kamps.reviews.models.Reviews;
import com.kamps.reviews.services.ReviewsService;
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
@RequestMapping("/reviews")
public class ReviewsController {

    @Autowired
    private ReviewsService reviewsService;


    @GetMapping
    public ResponseEntity<List<Reviews>> getAllReviews() {
        return new ResponseEntity<>(reviewsService.getAllReviews(), HttpStatus.OK);
    }

    @PostMapping("/createReview")
    public ResponseEntity<Reviews> createReview(@RequestBody Reviews review) {
        return new ResponseEntity<>(reviewsService.createReview(review), HttpStatus.CREATED);
    }


    /*@GetMapping("/{reviewID}")
    public ResponseEntity<Reviews> getReviewById(@PathVariable Long reviewID) {
        return new ResponseEntity<>(reviewsService.getReviewById(reviewID), HttpStatus.OK);
    }*/

    // Add other controller methods for update, delete, etc.
}