package com.example.api_rest_mobile.services;

import com.example.api_rest_mobile.service.ObservationService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ObservationServiceTest {
    ObservationService observationService;

    @Autowired
    ObservationServiceTest(ObservationService observationService) {
        this.observationService = observationService;
    }

    @Test
    void testGetAllObservations() {
        System.out.println(observationService.getAllObservations());
    }

    @Test
    void testGetObservationById() {
        System.out.println(observationService.getObservationById(1L));
    }

    @Test
    void testGetObservationsByInterventionId() {
        System.out.println(observationService.getObservationsByInterventionId(1L));
    }

    @Test
    void testCreateObservation() {
        System.out.println(observationService.createObservation(null));
    }

    @Test
    void testUpdateObservation() {
        System.out.println(observationService.updateObservation(1L, null));
    }

    @Test
    void testDeleteObservation() {
        observationService.deleteObservation(2L);
    }
}
