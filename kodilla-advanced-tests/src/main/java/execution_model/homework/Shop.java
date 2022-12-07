package execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    Set<Order> orders = new HashSet<>();

    public void add (Order order) {
        orders.add(order);
    }



    public List<Order> getByDates(LocalDate start, LocalDate finish){
        return orders.stream()
                .filter(order -> (order.getDate().isEqual(start) || order.getDate().isAfter(start))
                        && (order.getDate().isBefore(finish) || order.getDate().isEqual(finish) ))
                .collect(Collectors.toList());

    }

    public Set<Order> getByValue(double min, double max){
        return orders.stream()
                .filter(order -> order.getValue()>=min && order.getValue()<=max)
                .collect(Collectors.toSet());
    }


    public int sizeNumberOfOrders(){
        return orders.size();
    }


    public double sumOfOrders(){
        return orders.stream().mapToDouble(Order::getValue).sum();
    }
}