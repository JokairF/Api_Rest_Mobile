package com.example.api_rest_mobile.mapper;

import com.example.api_rest_mobile.dto.InterventionDTO;
import com.example.api_rest_mobile.entity.Intervention;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface InterventionMapper {

    InterventionDTO toDTO(Intervention intervention);
    Intervention toEntity(InterventionDTO interventionDTO);
}
