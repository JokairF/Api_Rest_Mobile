package com.example.api_rest_mobile.mapper;

import com.example.api_rest_mobile.dto.UtilisateurDTO;
import com.example.api_rest_mobile.entity.Utilisateur;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UtilisateurMapper {

    UtilisateurDTO toDTO(Utilisateur utilisateur);
    Utilisateur toEntity(UtilisateurDTO utilisateurDTO);
}
