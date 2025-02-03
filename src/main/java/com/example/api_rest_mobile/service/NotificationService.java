package com.example.api_rest_mobile.service;

import com.example.api_rest_mobile.entity.Notification;
import com.example.api_rest_mobile.repository.NotificationRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

    public Notification getNotificationById(Long id) {
        return notificationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Notification non trouvée"));
    }

    public List<Notification> getNotificationsByInterventionId(Long interventionId) {
        return notificationRepository.findByInterventionId(interventionId);
    }

    public Notification createNotification(Notification notification) {
        return notificationRepository.save(notification);
    }

    public Notification updateNotification(Long id, Notification notificationDetails) {
        Notification notification = notificationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Notification non trouvée"));
        notification.setMessage(notificationDetails.getMessage());
        notification.setLu(notificationDetails.getLu());
        return notificationRepository.save(notification);
    }

    public void deleteNotification(Long id) {
        notificationRepository.deleteById(id);
    }
}