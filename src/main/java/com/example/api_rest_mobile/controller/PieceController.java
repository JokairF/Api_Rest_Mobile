package com.example.api_rest_mobile.controller;

import com.example.api_rest_mobile.entity.Piece;
import com.example.api_rest_mobile.service.PieceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pieces")
public class PieceController {
    private final PieceService pieceService;

    public PieceController(PieceService pieceService) {
        this.pieceService = pieceService;
    }

    @GetMapping
    public List<Piece> getAllPieces() {
        return pieceService.getAllPieces();
    }

    @GetMapping("/{id}")
    public Piece getPieceById(@PathVariable Long id) {
        return pieceService.getPieceById(id);
    }

    @GetMapping("/logement/{logementId}")
    public List<Piece> getPiecesByLogementId(@PathVariable Long logementId) {
        return pieceService.getPiecesByLogementId(logementId);
    }

    @PostMapping
    public Piece createPiece(@RequestBody Piece piece) {
        return pieceService.createPiece(piece);
    }

    @PutMapping("/{id}")
    public Piece updatePiece(@PathVariable Long id, @RequestBody Piece pieceDetails) {
        return pieceService.updatePiece(id, pieceDetails);
    }

    @DeleteMapping("/{id}")
    public void deletePiece(@PathVariable Long id) {
        pieceService.deletePiece(id);
    }
}