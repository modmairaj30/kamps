package com.kamps.images.services;

import com.kamps.images.models.Image;
import com.kamps.images.repository.ImagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImagesRepository imagesRepository;

    @Override
    public List<Image> getAllImages() {
        return imagesRepository.findAll();
    }

    @Override
    public Image createImage(Image image) {
        return imagesRepository.save(image);
    }
    /*@Override
    public Image getImageById(Long imageId) {
        return imagesRepository.findById(imageId).orElseThrow(() -> new RuntimeException("Image not found"));
    }



    @Override
    public Image updateImage(Long imageId, Image image) {
        Image existingImage = imagesRepository.findById(imageId).orElseThrow(() -> new RuntimeException("Image not found"));
        existingImage.setEntityId(image.getEntityId());
        existingImage.setImageUrl(image.getImageUrl());
        existingImage.setDescription(image.getDescription());
        existingImage.setEntityType(image.getEntityType());
        return imagesRepository.save(existingImage);
    }

    @Override
    public void deleteImage(Long imageId) {
        imagesRepository.deleteById(imageId);
    }*/

}
