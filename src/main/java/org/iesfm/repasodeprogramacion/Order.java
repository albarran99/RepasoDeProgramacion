package org.iesfm.repasodeprogramacion;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Order implements Comparable<Order>{
    private int numOrder;
    private LocalDateTime date;
    private List<OrderLine> orderLines;

    public Order(int numOrder, LocalDateTime date, List<OrderLine> orderLines) {
        this.numOrder = numOrder;
        this.date = date;
        this.orderLines = orderLines;
    }

    public int price() {
        int finalPrice = 0;

        for (OrderLine orderLine : orderLines) {
             finalPrice = finalPrice + orderLine.calculatePrice();
        }

        return finalPrice;
    }

    @Override
    public int compareTo(Order o) {
        return this.date.compareTo(o.getDate());
    }


    public int getNumOrder() {
        return numOrder;
    }

    public void setNumOrder(int numOrder) {
        this.numOrder = numOrder;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return numOrder == order.numOrder && Objects.equals(date, order.date) && Objects.equals(orderLines, order.orderLines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numOrder, date, orderLines);
    }

    @Override
    public String toString() {
        return "Order{" +
                "numOrder=" + numOrder +
                ", date=" + date +
                ", orderLines=" + orderLines +
                '}';
    }
}
