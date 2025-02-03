package com.example.api_rest_mobile.controller;

import com.example.api_rest_mobile.entity.Notification;
import com.example.api_rest_mobile.service.NotificationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {
    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping
    public List<Notification> getAllNotifications() {
        return notificationService.getAllNotifications();
    }

    @GetMapping("/{id}")
    public Notification getNotificationById(@PathVariable Long id) {
        return notificationService.getNotificationById(id);
    }

    @GetMapping("/intervention/{interventionId}")
    public List<Notification> getNotificationsByInterventionId(@PathVariable Long interventionId) {
        return notificationService.getNotificationsByInterventionId(interventionId);
    }

    @PostMapping
    public Notification createNotification(@RequestBody Notification notification) {
        return notificationService.createNotification(notification);
    }

    @PutMapping("/{id}")
    public Notification updateNotification(@PathVariable Long id, @RequestBody Notification notificationDetails) {
        return notificationService.updateNotification(id, notificationDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteNotification(@PathVariable Long id) {
        notificationService.deleteNotification(id);
    }
}