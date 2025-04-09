package com.example.api_rest_mobile.services;

import com.example.api_rest_mobile.service.TacheService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TacheServiceTest {
    TacheService tacheService;

    @Autowired
    TacheServiceTest(TacheService tacheService) {
        this.tacheService = tacheService;
    }

    @Test
    void testGetAllTaches() {
        System.out.println(tacheService.getAllTaches());
    }

    @Test
    void testGetTacheById() {
        System.out.println(tacheService.getTacheById(1L));
    }

    @Test
    void testCreateTache() {
        System.out.println(tacheService.createTache(null));
    }

    @Test
    void testUpdateTache() {
        System.out.println(tacheService.updateTache(1L, null));
    }

    @Test
    void testDeleteTache() {
        tacheService.deleteTache(2L);
    }
}
