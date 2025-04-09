package com.example.api_rest_mobile.services;

import com.example.api_rest_mobile.service.PieceService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PieceServiceTest {
    PieceService pieceService;

    @Autowired
    public PieceServiceTest(PieceService pieceService) {
        this.pieceService = pieceService;
    }

    @Test
    void testGetAllPieces() {
        System.out.println(pieceService.getAllPieces());
    }

    @Test
    void testGetPieceById() {
        System.out.println(pieceService.getPieceById(1L));
    }

    @Test
    void testGetPiecesByLogementId() {
        System.out.println(pieceService.getPiecesByLogementId(1L));
    }

    @Test
    void testCreatePiece() {
        System.out.println(pieceService.createPiece(null));
    }

    @Test
    void testUpdatePiece() {
        System.out.println(pieceService.updatePiece(1L, null));
    }

    @Test
    void testDeletePiece() {
        pieceService.deletePiece(2L);
    }
}
