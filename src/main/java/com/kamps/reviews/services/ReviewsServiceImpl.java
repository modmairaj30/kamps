package com.kamps.reviews.services;

import com.kamps.reviews.models.Reviews;
import com.kamps.reviews.repository.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewsServiceImpl implements ReviewsService {

    @Autowired
    private ReviewsRepository reviewsRepository;

    @Override
    public Reviews createReview(Reviews review) {
        return reviewsRepository.save(review);
    }

    @Override
    public List<Reviews> getAllReviews() {
        return reviewsRepository.findAll();
    }

  /*  @Override
    public Reviews getReviewById(Long reviewID) {
        return reviewsRepository.findById(reviewID).orElseThrow(() -> new RuntimeException("Review not found"));
    }*/

    // Implement other service methods for update, delete, etc.
}
