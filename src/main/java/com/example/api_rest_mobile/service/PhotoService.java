package com.example.api_rest_mobile.service;

import com.example.api_rest_mobile.entity.Photo;
import com.example.api_rest_mobile.repository.PhotoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PhotoService {
    private final PhotoRepository photoRepository;

    public PhotoService(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    public List<Photo> getAllPhotos() {
        return photoRepository.findAll();
    }

    public Photo getPhotoById(Long id) {
        return photoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Photo non trouvée"));
    }

    public List<Photo> getPhotosByObservationId(Long observationId) {
        return photoRepository.findByObservationId(observationId);
    }

    public Photo createPhoto(Photo photo) {
        return photoRepository.save(photo);
    }

    public Photo updatePhoto(Long id, Photo photoDetails) {
        Photo photo = photoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Photo non trouvée"));
        photo.setChemin(photoDetails.getChemin());
        return photoRepository.save(photo);
    }

    public void deletePhoto(Long id) {
        photoRepository.deleteById(id);
    }
}