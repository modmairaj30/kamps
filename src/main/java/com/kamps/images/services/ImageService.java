package com.kamps.images.services;


import com.kamps.images.models.Image;

import java.util.List;

public interface ImageService {
    List<ImageResponse> getAllImages();
    //Image getImageById(Long imageId);
    Image createImage(Image image);
    //Image updateImage(Long imageId, Image image);
    //void deleteImage(Long imageId);
}
