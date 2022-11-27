package com.kodilla.stream.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistExeption{


    Warehouse warehouse = new Warehouse();
    warehouse.addOrder(new Order("1"));
    warehouse.addOrder(new Order("2"));
    warehouse.addOrder(new Order("3"));

    warehouse.getOrder("1");

    try {
        Order result = warehouse.getOrder("4");
        System.out.println(result);

    } catch (OrderDoesntExistExeption e) {
        System.out.println("Order doesnt exist");

    }
    }



}
