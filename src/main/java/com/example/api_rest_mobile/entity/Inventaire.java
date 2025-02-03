package com.example.api_rest_mobile.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "inventaire")
@Getter
@Setter
public class Inventaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "logement_id")
    private Logement logement;

    private String description;
    private Integer quantite;
    private String date;
}