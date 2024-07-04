package com.kamps.images.controllers;

import com.kamps.images.models.Image;
import com.kamps.images.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/images")
public class ImagesController {

    @Autowired
    private ImageService imageService;

    @GetMapping
    public List<Image> getAllImages() {
        return imageService.getAllImages();
    }

    @PostMapping
    public Image createImage(@RequestBody Image image) {

        return imageService.createImage(image);
    }

    /*@GetMapping("/{imageId}")
    public Image getImageById(@PathVariable Long imageId) {
        return imageService.getImageById(imageId);
    }



    @PutMapping("/{imageId}")
    public Image updateImage(@PathVariable Long imageId, @RequestBody Image image) {
        return imageService.updateImage(imageId, image);
    }

    @DeleteMapping("/{imageId}")
    public void deleteImage(@PathVariable Long imageId) {
        imageService.deleteImage(imageId);
    }

     */
}
