package com.kamps.reviews.services;


import com.kamps.reviews.models.Reviews;

import java.util.List;

public interface ReviewsService {

    Reviews createReview(Reviews review);

    List<Reviews> getAllReviews();

   // Reviews getReviewById(Long reviewID);

    // Add other service methods for update, delete, etc.
}