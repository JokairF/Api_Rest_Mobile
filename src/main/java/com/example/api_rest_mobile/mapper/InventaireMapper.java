package com.example.api_rest_mobile.mapper;

import com.example.api_rest_mobile.dto.InventaireDTO;
import com.example.api_rest_mobile.entity.Inventaire;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface InventaireMapper {

    InventaireDTO toDTO(Inventaire inventaire);
    Inventaire toEntity(InventaireDTO inventaireDTO);
}
