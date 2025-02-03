package com.example.api_rest_mobile.service;

import com.example.api_rest_mobile.entity.Piece;
import com.example.api_rest_mobile.repository.PieceRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PieceService {
    private final PieceRepository pieceRepository;

    public PieceService(PieceRepository pieceRepository) {
        this.pieceRepository = pieceRepository;
    }

    public List<Piece> getAllPieces() {
        return pieceRepository.findAll();
    }

    public Piece getPieceById(Long id) {
        return pieceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pièce non trouvée"));
    }

    public List<Piece> getPiecesByLogementId(Long logementId) {
        return pieceRepository.findByLogementId(logementId);
    }

    public Piece createPiece(Piece piece) {
        return pieceRepository.save(piece);
    }

    public Piece updatePiece(Long id, Piece pieceDetails) {
        Piece piece = pieceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pièce non trouvée"));
        piece.setNom(pieceDetails.getNom());
        return pieceRepository.save(piece);
    }

    public void deletePiece(Long id) {
        pieceRepository.deleteById(id);
    }
}