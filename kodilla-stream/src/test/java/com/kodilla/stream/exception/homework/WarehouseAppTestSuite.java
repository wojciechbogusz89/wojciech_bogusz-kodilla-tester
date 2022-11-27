package com.kodilla.stream.exception.homework;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseAppTestSuite {
    @Test
    public void testGetOrder() throws OrderDoesntExistExeption {
        Warehouse warehouse = new Warehouse();
        Order order = new Order("1");
        warehouse.addOrder(order);
        Order result = warehouse.getOrder("1");
        Order expectedOrder = order;
        assertEquals(expectedOrder, result);
    }

    @Test
    public void shouldThrowExceptionWhenOrderDoesNotExist() throws OrderDoesntExistExeption {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        assertThrows(OrderDoesntExistExeption.class, () -> warehouse.getOrder("4"));
            System.out.println("doesnt exist");

    }
}