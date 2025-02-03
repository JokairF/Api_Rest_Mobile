package com.example.api_rest_mobile.service;

import com.example.api_rest_mobile.entity.Inventaire;
import com.example.api_rest_mobile.repository.InventaireRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InventaireService {
    private final InventaireRepository inventaireRepository;

    public InventaireService(InventaireRepository inventaireRepository) {
        this.inventaireRepository = inventaireRepository;
    }

    public List<Inventaire> getAllInventaires() {
        return inventaireRepository.findAll();
    }

    public Inventaire getInventaireById(Long id) {
        return inventaireRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Inventaire non trouvé"));
    }

    public List<Inventaire> getInventairesByLogementId(Long logementId) {
        return inventaireRepository.findByLogementId(logementId);
    }

    public Inventaire createInventaire(Inventaire inventaire) {
        return inventaireRepository.save(inventaire);
    }

    public Inventaire updateInventaire(Long id, Inventaire inventaireDetails) {
        Inventaire inventaire = inventaireRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Inventaire non trouvé"));
        inventaire.setDescription(inventaireDetails.getDescription());
        inventaire.setQuantite(inventaireDetails.getQuantite());
        inventaire.setDate(inventaireDetails.getDate());
        return inventaireRepository.save(inventaire);
    }

    public void deleteInventaire(Long id) {
        inventaireRepository.deleteById(id);
    }
}