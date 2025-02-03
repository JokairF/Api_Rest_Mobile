package com.example.api_rest_mobile.controller;

import com.example.api_rest_mobile.entity.Inventaire;
import com.example.api_rest_mobile.service.InventaireService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventaires")
public class InventaireController {
    private final InventaireService inventaireService;

    public InventaireController(InventaireService inventaireService) {
        this.inventaireService = inventaireService;
    }

    @GetMapping
    public List<Inventaire> getAllInventaires() {
        return inventaireService.getAllInventaires();
    }

    @GetMapping("/{id}")
    public Inventaire getInventaireById(@PathVariable Long id) {
        return inventaireService.getInventaireById(id);
    }

    @GetMapping("/logement/{logementId}")
    public List<Inventaire> getInventairesByLogementId(@PathVariable Long logementId) {
        return inventaireService.getInventairesByLogementId(logementId);
    }

    @PostMapping
    public Inventaire createInventaire(@RequestBody Inventaire inventaire) {
        return inventaireService.createInventaire(inventaire);
    }

    @PutMapping("/{id}")
    public Inventaire updateInventaire(@PathVariable Long id, @RequestBody Inventaire inventaireDetails) {
        return inventaireService.updateInventaire(id, inventaireDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteInventaire(@PathVariable Long id) {
        inventaireService.deleteInventaire(id);
    }
}