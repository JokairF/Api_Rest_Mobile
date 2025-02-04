package com.example.api_rest_mobile.mapper;

import com.example.api_rest_mobile.dto.PhotoDTO;
import com.example.api_rest_mobile.entity.Photo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PhotoMapper {

    PhotoDTO toDTO(Photo photo);
    Photo toEntity(PhotoDTO photoDTO);
}
