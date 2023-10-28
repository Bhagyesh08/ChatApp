package com.example.chatapp.notifications.entity


data class PushNotification(
    val data: NotificationData,
    val to: String
)