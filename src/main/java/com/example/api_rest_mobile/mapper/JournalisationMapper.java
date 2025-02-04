package com.example.api_rest_mobile.mapper;

import com.example.api_rest_mobile.dto.JournalisationDTO;
import com.example.api_rest_mobile.entity.Journalisation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface JournalisationMapper {

    JournalisationDTO toDTO(Journalisation journalisation);
    Journalisation toEntity(JournalisationDTO journalisationDTO);
}
