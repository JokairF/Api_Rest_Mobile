package com.example.api_rest_mobile.mapper;

import com.example.api_rest_mobile.dto.LogementDTO;
import com.example.api_rest_mobile.entity.Logement;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface LogementMapper {
    LogementMapper INSTANCE = Mappers.getMapper(LogementMapper.class);

    LogementDTO toDTO(Logement logement);
    Logement toEntity(LogementDTO logementDTO);
}
