package entities;

import entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private LocalDateTime DateofTheOrder;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(LocalDateTime dateofTheOrder, OrderStatus status, List<OrderItem> items) {
        DateofTheOrder = dateofTheOrder;
        this.status = status;
        this.items = items;
    }

    public LocalDateTime getDateofTheOrder() {
        return DateofTheOrder;
    }

    public void setDateofTheOrder(LocalDateTime dateofTheOrder) {
        DateofTheOrder = dateofTheOrder;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public Double total() {
        double sum = 0.0;

        for (OrderItem item : items) {
            sum += item.subTotal();
        }

        return sum;
    }
}
