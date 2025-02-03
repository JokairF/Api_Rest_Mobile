package com.example.api_rest_mobile.mapper;

import com.example.api_rest_mobile.dto.TacheDTO;
import com.example.api_rest_mobile.entity.Tache;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TacheMapper {
    TacheMapper INSTANCE = Mappers.getMapper(TacheMapper.class);

    TacheDTO toDTO(Tache tache);
    Tache toEntity(TacheDTO tacheDTO);
}
