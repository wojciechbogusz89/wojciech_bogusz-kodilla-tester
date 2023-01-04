package com.kodilla.spring.basic.dependency_injection.homework;

import com.kodilla.spring.basic.dependency_injection.MessageService;

public class ShippingCenter {
    private  DeliveryService deliveryService;
    private  NotificationService notificationService;

    public ShippingCenter(DeliveryService deliveryService, NotificationService notificationService) {
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }

    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }
}
