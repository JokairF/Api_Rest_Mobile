package com.example.api_rest_mobile.services;

import com.example.api_rest_mobile.service.PhotoService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PhotoServiceTest {
    PhotoService photoService;

    @Autowired
    PhotoServiceTest(PhotoService photoService) {
        this.photoService = photoService;
    }

    @Test
    void testGetAllPhotos() {
        System.out.println(photoService.getAllPhotos());
    }

    @Test
    void testGetPhotoById() {
        System.out.println(photoService.getPhotoById(1L));
    }

    @Test
    void testCreatePhoto() {
        System.out.println(photoService.createPhoto(null));
    }

    @Test
    void testUpdatePhoto() {
        System.out.println(photoService.updatePhoto(1L, null));
    }

    @Test
    void testDeletePhoto() {
        photoService.deletePhoto(2L);
    }
}
