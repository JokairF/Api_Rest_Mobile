package com.example.api_rest_mobile.repository;

import com.example.api_rest_mobile.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByInterventionId(Long interventionId);
}