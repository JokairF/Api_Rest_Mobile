package com.example.api_rest_mobile.repository;

import com.example.api_rest_mobile.entity.Piece;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PieceRepository extends JpaRepository<Piece, Long> {
    List<Piece> findByLogementId(Long logementId);
}