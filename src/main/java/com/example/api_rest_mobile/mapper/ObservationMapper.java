package com.example.api_rest_mobile.mapper;

import com.example.api_rest_mobile.dto.ObservationDTO;
import com.example.api_rest_mobile.entity.Observation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ObservationMapper {

    ObservationDTO toDTO(Observation observation);
    Observation toEntity(ObservationDTO observationDTO);
}
