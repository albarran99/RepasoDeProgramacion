package org.iesfm.repasodeprogramacion;

public class CustomersNotFoundException extends Exception {
    private String id;

    public CustomersNotFoundException(String id) {
        this.id = id;
    }

    public CustomersNotFoundException(String message, String id) {
        super(message);
        this.id = id;
    }

    public CustomersNotFoundException(String message, Throwable cause, String id) {
        super(message, cause);
        this.id = id;
    }
}
