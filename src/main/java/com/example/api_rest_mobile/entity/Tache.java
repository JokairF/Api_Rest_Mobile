package com.example.api_rest_mobile.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tache")
@Getter
@Setter
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Boolean statut = false;

    @ManyToOne
    @JoinColumn(name = "piece_id")
    private Piece piece;
}