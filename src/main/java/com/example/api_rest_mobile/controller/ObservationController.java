package com.example.api_rest_mobile.controller;

import com.example.api_rest_mobile.entity.Observation;
import com.example.api_rest_mobile.service.ObservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/observations")
public class ObservationController {
    private final ObservationService observationService;

    public ObservationController(ObservationService observationService) {
        this.observationService = observationService;
    }

    @GetMapping
    public List<Observation> getAllObservations() {
        return observationService.getAllObservations();
    }

    @GetMapping("/{id}")
    public Observation getObservationById(@PathVariable Long id) {
        return observationService.getObservationById(id);
    }

    @GetMapping("/intervention/{interventionId}")
    public List<Observation> getObservationsByInterventionId(@PathVariable Long interventionId) {
        return observationService.getObservationsByInterventionId(interventionId);
    }

    @PostMapping
    public Observation createObservation(@RequestBody Observation observation) {
        return observationService.createObservation(observation);
    }

    @PutMapping("/{id}")
    public Observation updateObservation(@PathVariable Long id, @RequestBody Observation observationDetails) {
        return observationService.updateObservation(id, observationDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteObservation(@PathVariable Long id) {
        observationService.deleteObservation(id);
    }
}