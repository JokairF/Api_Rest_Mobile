package com.example.api_rest_mobile.services;

import com.example.api_rest_mobile.service.LogementService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LogementServiceTest {
    LogementService logementService;

    @Autowired
    public LogementServiceTest(LogementService logementService) {
        this.logementService = logementService;
    }

    @Test
    void testGetAllLogements() {
        System.out.println(logementService.getAllLogements());
    }

    @Test
    void testGetLogementById() {
        System.out.println(logementService.getLogementById(1L));
    }

    @Test
    void testCreateLogement() {
        System.out.println(logementService.createLogement(null));
    }

    @Test
    void testUpdateLogement() {
        System.out.println(logementService.updateLogement(1L, null));
    }

    @Test
    void testDeleteLogement() {
        logementService.deleteLogement(2L);
    }

    @Test
    void testFindByAdresse() {
        System.out.println(logementService.findByAdresse("adresse"));
    }
}