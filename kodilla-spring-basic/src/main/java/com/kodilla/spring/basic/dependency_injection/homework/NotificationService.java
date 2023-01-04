package com.kodilla.spring.basic.dependency_injection.homework;

public class NotificationService implements NotificationInterface {
    @Override
    public void success(String address) {
        System.out.println("Packaged delivered to: " + address);
    }
    @Override
    public void fail(String address){
        System.out.println("Package not deliverd to: " + address);
    }
}
