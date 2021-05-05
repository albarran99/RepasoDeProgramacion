package org.iesfm.repasodeprogramacion;

public class OrderNotFoundException extends Exception {
    private int numOrder;

    public OrderNotFoundException(int numOrder) {
        this.numOrder = numOrder;
    }

    public OrderNotFoundException(String message, int numOrder) {
        super(message);
        this.numOrder = numOrder;
    }
}
