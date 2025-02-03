package com.example.api_rest_mobile.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "logement")
@Getter
@Setter
public class Logement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String adresse;
    private String description;

    @OneToMany(mappedBy = "logement", cascade = CascadeType.ALL)
    private List<Piece> pieces;
}