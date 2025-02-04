package com.example.api_rest_mobile.service;

import com.example.api_rest_mobile.dto.TacheDTO;
import com.example.api_rest_mobile.entity.Tache;
import com.example.api_rest_mobile.mapper.TacheMapper;
import com.example.api_rest_mobile.repository.TacheRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TacheService {

    private final TacheRepository tacheRepository;
    private final TacheMapper tacheMapper;

    public List<TacheDTO> getAllTaches() {
        List<Tache> taches = tacheRepository.findAll();
        return taches.stream()
                .map(tacheMapper::toDTO)
                .collect(Collectors.toList());
    }

    public TacheDTO getTacheById(Long id) {
        Tache tache = tacheRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tâche non trouvée"));
        return tacheMapper.toDTO(tache);
    }

    public List<TacheDTO> getTachesByPieceId(Long pieceId) {
        List<Tache> taches = tacheRepository.findByPieceId(pieceId);
        return taches.stream()
                .map(tacheMapper::toDTO)
                .collect(Collectors.toList());
    }

    public TacheDTO createTache(TacheDTO tacheDTO) {
        Tache tache = tacheMapper.toEntity(tacheDTO);
        Tache savedTache = tacheRepository.save(tache);
        return tacheMapper.toDTO(savedTache);
    }

    public TacheDTO updateTache(Long id, TacheDTO tacheDetails) {
        Tache tache = tacheRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tâche non trouvée"));
        tache.setDescription(tacheDetails.getDescription());
        tache.setStatut(tacheDetails.getStatut());
        // Si besoin de mettre à jour le pieceId, vous pouvez le faire ici.
        Tache updatedTache = tacheRepository.save(tache);
        return tacheMapper.toDTO(updatedTache);
    }

    public void deleteTache(Long id) {
        tacheRepository.deleteById(id);
    }
}
