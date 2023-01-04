package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
       DeliveryService deliveryService = new DeliveryService();
       NotificationService notificationService = new NotificationService();
       ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);
       shippingCenter.sendPackage("hill street 11, New York", 18.2);
    }
}
