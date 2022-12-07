package execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    private Shop shop = new Shop();
    private Order order1 = new Order(10.0, LocalDate.of(2022,10,11), "jankowalski");
    private Order order2 = new Order(20.0, LocalDate.of(2022,10,12), "jaroslawkaczynski");
    private Order order3 = new Order(30.0, LocalDate.of(2022,10,13), "AndrzejDuda");

    @BeforeEach
    void initialize(){
        shop.add(order1);
        shop.add(order2);
        shop.add(order3);

    }
    @Test
    public void sumAndValueOfOrders(){
        assertEquals(3, shop.sizeNumberOfOrders());
        assertEquals(60.0, shop.sumOfOrders());
    }
    @Test
    public void shouldReturnOrderInDate(){
        List<Order> expectedOrder = new ArrayList<>();
        expectedOrder.add(order1);
        assertEquals(expectedOrder, shop.getByDates(LocalDate.of(2022,10,10), LocalDate.of(2022,10,11)));
    }

    @Test
    public void shouldReturnEmpptyListForOutOfRangeOrders(){
        assertEquals(new HashSet<>(), shop.getByValue(5.0,8.0));

    }









}