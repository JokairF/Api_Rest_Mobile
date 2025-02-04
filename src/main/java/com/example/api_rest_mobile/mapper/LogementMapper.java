package com.example.api_rest_mobile.mapper;

import com.example.api_rest_mobile.dto.LogementDTO;
import com.example.api_rest_mobile.entity.Logement;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LogementMapper {
    LogementDTO toDTO(Logement logement);
    Logement toEntity(LogementDTO logementDTO);
}
