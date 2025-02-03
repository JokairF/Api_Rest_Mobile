package com.example.api_rest_mobile.repository;

import com.example.api_rest_mobile.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhotoRepository extends JpaRepository<Photo, Long> {
    List<Photo> findByObservationId(Long observationId);
}