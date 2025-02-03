package com.example.api_rest_mobile.service;

import com.example.api_rest_mobile.entity.Observation;
import com.example.api_rest_mobile.repository.ObservationRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ObservationService {
    private final ObservationRepository observationRepository;

    public ObservationService(ObservationRepository observationRepository) {
        this.observationRepository = observationRepository;
    }

    public List<Observation> getAllObservations() {
        return observationRepository.findAll();
    }

    public Observation getObservationById(Long id) {
        return observationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Observation non trouvée"));
    }

    public List<Observation> getObservationsByInterventionId(Long interventionId) {
        return observationRepository.findByInterventionId(interventionId);
    }

    public Observation createObservation(Observation observation) {
        return observationRepository.save(observation);
    }

    public Observation updateObservation(Long id, Observation observationDetails) {
        Observation observation = observationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Observation non trouvée"));
        observation.setCommentaire(observationDetails.getCommentaire());
        observation.setPhotoObligatoire(observationDetails.getPhotoObligatoire());
        return observationRepository.save(observation);
    }

    public void deleteObservation(Long id) {
        observationRepository.deleteById(id);
    }
}