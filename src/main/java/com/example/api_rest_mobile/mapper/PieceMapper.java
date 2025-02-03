package com.example.api_rest_mobile.mapper;

import com.example.api_rest_mobile.dto.PieceDTO;
import com.example.api_rest_mobile.entity.Piece;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PieceMapper {
    PieceMapper INSTANCE = Mappers.getMapper(PieceMapper.class);

    PieceDTO toDTO(Piece piece);
    Piece toEntity(PieceDTO pieceDTO);
}
