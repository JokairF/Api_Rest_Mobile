package com.example.api_rest_mobile.service;

import com.example.api_rest_mobile.entity.Tache;
import com.example.api_rest_mobile.repository.TacheRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TacheService {
    private final TacheRepository tacheRepository;

    public TacheService(TacheRepository tacheRepository) {
        this.tacheRepository = tacheRepository;
    }

    public List<Tache> getAllTaches() {
        return tacheRepository.findAll();
    }

    public Tache getTacheById(Long id) {
        return tacheRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tâche non trouvée"));
    }

    public List<Tache> getTachesByPieceId(Long pieceId) {
        return tacheRepository.findByPieceId(pieceId);
    }

    public Tache createTache(Tache tache) {
        return tacheRepository.save(tache);
    }

    public Tache updateTache(Long id, Tache tacheDetails) {
        Tache tache = tacheRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tâche non trouvée"));
        tache.setDescription(tacheDetails.getDescription());
        tache.setStatut(tacheDetails.getStatut());
        return tacheRepository.save(tache);
    }

    public void deleteTache(Long id) {
        tacheRepository.deleteById(id);
    }
}