package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationManager {

    private final NotificationService notificationService;
    public NotificationManager(@Qualifier("sms") NotificationService notificationservice){

        this.notificationService=notificationservice;
    }

    public void SendNotification()
    {
        notificationService.send("hi notified");
    }
}
