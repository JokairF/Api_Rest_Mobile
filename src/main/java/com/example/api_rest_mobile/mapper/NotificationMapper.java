package com.example.api_rest_mobile.mapper;

import com.example.api_rest_mobile.dto.NotificationDTO;
import com.example.api_rest_mobile.entity.Notification;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface NotificationMapper {

    NotificationDTO toDTO(Notification notification);
    Notification toEntity(NotificationDTO notificationDTO);
}