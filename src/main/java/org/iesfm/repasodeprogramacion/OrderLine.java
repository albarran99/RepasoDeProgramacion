package org.iesfm.repasodeprogramacion;

import java.util.Objects;

public class OrderLine {
    private int quantity;
    private String productName;
    private int cost;

    public OrderLine(int quantity, String productName, int cost) {
        this.quantity = quantity;
        this.productName = productName;
        this.cost = cost;
    }

    public int calculatePrice() {
        return cost * quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderLine orderLine = (OrderLine) o;
        return quantity == orderLine.quantity && cost == orderLine.cost && Objects.equals(productName, orderLine.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, productName, cost);
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "quantity=" + quantity +
                ", productName='" + productName + '\'' +
                ", cost=" + cost +
                '}';
    }
}
