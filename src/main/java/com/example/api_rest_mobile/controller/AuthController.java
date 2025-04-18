package com.example.api_rest_mobile.controller;

import com.example.api_rest_mobile.dto.ErrorResponse;
import com.example.api_rest_mobile.dto.LoginRequest;
import com.example.api_rest_mobile.dto.LoginResponse;
import com.example.api_rest_mobile.entity.Utilisateur;
import com.example.api_rest_mobile.security.JwtProvider;
import com.example.api_rest_mobile.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import static com.example.api_rest_mobile.config.DataInitializer.logger;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final JwtProvider jwtProvider;
    private final UtilisateurService utilisateurService;

    @Autowired
    public AuthController(AuthenticationManager authenticationManager,
                          JwtProvider jwtProvider,
                          UtilisateurService utilisateurService) {
        this.authenticationManager = authenticationManager;
        this.jwtProvider = jwtProvider;
        this.utilisateurService = utilisateurService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {
        logger.info("Tentative de connexion : {}", loginRequest.getEmail());
        try {
            // Authentification avec Spring Security
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            loginRequest.getEmail(),
                            loginRequest.getMotDePasse()
                    )
            );
            SecurityContextHolder.getContext().setAuthentication(authentication);
            logger.info("Connexion réussie : {}", loginRequest.getEmail());

            // Génére le token JWT
            String jwt = jwtProvider.generateToken(authentication);

            // Récupére l'utilisateur depuis la base de données
            Utilisateur utilisateurDTO = utilisateurService.findByEmail(loginRequest.getEmail());

            logger.info("Token JWT généré pour l'utilisateur: {}", loginRequest.getEmail());

            // Construit et renvoyer la réponse
            LoginResponse loginResponse = new LoginResponse(
                    utilisateurDTO.getId(),
                    utilisateurDTO.getEmail(),
                    utilisateurDTO.getNom(),
                    utilisateurDTO.getRole().name(),
                    jwt
            );

            return ResponseEntity.ok(loginResponse);

        } catch (AuthenticationException ex) {
            logger.warn("Échec de l'authentification pour l'utilisateur: {}, raison: {}",
                    loginRequest.getEmail(), ex.getMessage());
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(new ErrorResponse("Identifiants invalides"));
        }
    }
}
