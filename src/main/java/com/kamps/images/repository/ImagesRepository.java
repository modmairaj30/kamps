package com.kamps.images.repository;


import com.kamps.images.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImagesRepository extends JpaRepository<Image, Long> {
}