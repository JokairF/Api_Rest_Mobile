package com.example.api_rest_mobile.controller;

import com.example.api_rest_mobile.entity.Photo;
import com.example.api_rest_mobile.service.PhotoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/photos")
public class PhotoController {
    private final PhotoService photoService;

    public PhotoController(PhotoService photoService) {
        this.photoService = photoService;
    }

    @GetMapping
    public List<Photo> getAllPhotos() {
        return photoService.getAllPhotos();
    }

    @GetMapping("/{id}")
    public Photo getPhotoById(@PathVariable Long id) {
        return photoService.getPhotoById(id);
    }

    @GetMapping("/observation/{observationId}")
    public List<Photo> getPhotosByObservationId(@PathVariable Long observationId) {
        return photoService.getPhotosByObservationId(observationId);
    }

    @PostMapping
    public Photo createPhoto(@RequestBody Photo photo) {
        return photoService.createPhoto(photo);
    }

    @PutMapping("/{id}")
    public Photo updatePhoto(@PathVariable Long id, @RequestBody Photo photoDetails) {
        return photoService.updatePhoto(id, photoDetails);
    }

    @DeleteMapping("/{id}")
    public void deletePhoto(@PathVariable Long id) {
        photoService.deletePhoto(id);
    }
}