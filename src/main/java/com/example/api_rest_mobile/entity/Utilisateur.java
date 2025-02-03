package com.example.api_rest_mobile.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "utilisateur")
@Getter
@Setter
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String email;
    private String motDePasse;

    @Enumerated(EnumType.STRING)
    private Role role;
}