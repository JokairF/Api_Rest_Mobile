package com.example.api_rest_mobile.mapper;

import com.example.api_rest_mobile.dto.TacheDTO;
import com.example.api_rest_mobile.entity.Piece;
import com.example.api_rest_mobile.entity.Tache;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface TacheMapper {

    @Mapping(target = "pieceId", source = "piece.id")
    TacheDTO toDTO(Tache tache);

    @Mapping(target = "piece", source = "pieceId", qualifiedByName = "pieceFromId")
    Tache toEntity(TacheDTO tacheDTO);

    @Named("pieceFromId")
    default Piece pieceFromId(Long pieceId) {
        if (pieceId == null) {
            return null;
        }
        Piece piece = new Piece();
        piece.setId(pieceId);
        return piece;
    }
}
