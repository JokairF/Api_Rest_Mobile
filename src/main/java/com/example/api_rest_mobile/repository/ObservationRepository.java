package com.example.api_rest_mobile.repository;

import com.example.api_rest_mobile.entity.Observation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ObservationRepository extends JpaRepository<Observation, Long> {
    List<Observation> findByInterventionId(Long interventionId);
}