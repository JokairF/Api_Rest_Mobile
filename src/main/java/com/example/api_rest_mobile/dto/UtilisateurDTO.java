package com.example.api_rest_mobile.dto;

import com.example.api_rest_mobile.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UtilisateurDTO {
    private Long id;
    private String nom;
    private String email;
    private String motDePasse;
    private Role role; // Utilisation de l'enum pour garantir les valeurs ADMIN, INTERVENANT, etc.
}
