package com.example.api_rest_mobile.services;

import com.example.api_rest_mobile.service.InventaireService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class InventaireServiceTest {
    InventaireService inventaireService;

    @Autowired
    public InventaireServiceTest(InventaireService inventaireService) {
        this.inventaireService = inventaireService;
    }

    @Test
    void testGetAllInventaires() {
        System.out.println(inventaireService.getAllInventaires());
    }

    @Test
    void testGetInventaireById() {
        System.out.println(inventaireService.getInventaireById(1L));
    }

    @Test
    void testGetInventairesByLogementId() {
        System.out.println(inventaireService.getInventairesByLogementId(1L));
    }

    @Test
    void testCreateInventaire() {
        System.out.println(inventaireService.createInventaire(null));
    }

    @Test
    void testUpdateInventaire() {
        System.out.println(inventaireService.updateInventaire(1L, null));
    }

    @Test
    void testDeleteInventaire() {
        inventaireService.deleteInventaire(2L);
    }
}
