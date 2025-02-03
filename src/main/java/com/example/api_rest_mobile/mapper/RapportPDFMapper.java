package com.example.api_rest_mobile.mapper;

import com.example.api_rest_mobile.dto.RapportPDFDTO;
import com.example.api_rest_mobile.entity.RapportPDF;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RapportPDFMapper {
    RapportPDFMapper INSTANCE = Mappers.getMapper(RapportPDFMapper.class);

    RapportPDFDTO toDTO(RapportPDF rapportPDF);
    RapportPDF toEntity(RapportPDFDTO rapportPDFDTO);
}
