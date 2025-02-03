package com.example.api_rest_mobile.mapper;

import com.example.api_rest_mobile.dto.JournalisationDTO;
import com.example.api_rest_mobile.entity.Journalisation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface JournalisationMapper {
    JournalisationMapper INSTANCE = Mappers.getMapper(JournalisationMapper.class);

    JournalisationDTO toDTO(Journalisation journalisation);
    Journalisation toEntity(JournalisationDTO journalisationDTO);
}
