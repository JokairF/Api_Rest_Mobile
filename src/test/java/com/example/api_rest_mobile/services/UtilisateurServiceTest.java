package com.example.api_rest_mobile.services;

import com.example.api_rest_mobile.service.UtilisateurService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UtilisateurServiceTest {
    UtilisateurService utilisateurService;

    @Autowired
    public UtilisateurServiceTest(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @Test
    void testGetAllUtilisateurs() {
        System.out.println(utilisateurService.getAllUtilisateurs());
    }

    @Test
    void testGetUtilisateurById() {
        System.out.println(utilisateurService.getUtilisateurById(1L));
    }

    @Test
    void testCreateUtilisateur() {
        System.out.println(utilisateurService.createUtilisateur(null));
    }

    @Test
    void testUpdateUtilisateur() {
        System.out.println(utilisateurService.updateUtilisateur(1L, null));
    }

    @Test
    void testDeleteUtilisateur() {
        utilisateurService.deleteUtilisateur(2L);
    }

    @Test
    void testFindByEmail() {
        System.out.println(utilisateurService.findByEmail("admin@admin.com"));
    }
}


