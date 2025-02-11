package com.example.api_rest_mobile.config;

import com.example.api_rest_mobile.entity.Role;
import com.example.api_rest_mobile.entity.Utilisateur;
import com.example.api_rest_mobile.repository.UtilisateurRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

@Configuration
public class DataInitializer {

    private static final Logger logger = LoggerFactory.getLogger(DataInitializer.class);

    @Bean
    public CommandLineRunner initData(UtilisateurRepository utilisateurRepository,
                                      PasswordEncoder passwordEncoder) {
        return args -> {
            String adminEmail = "admin@admin.com";
            Optional<Utilisateur> adminOptional = utilisateurRepository.findByEmail(adminEmail);
            if (adminOptional.isEmpty()) {
                Utilisateur admin = new Utilisateur();
                admin.setNom("admin");
                admin.setEmail(adminEmail);
                // Chiffrer le mot de passe avant de le sauvegarder
                admin.setMotDePasse(passwordEncoder.encode("admin123")); // Mot de passe par défaut
                admin.setRole(Role.ADMIN);

                utilisateurRepository.save(admin);
                logger.info("Utilisateur admin créé avec succès.");
            } else {
                logger.info("Utilisateur admin déjà présent.");
            }
        };
    }
}
