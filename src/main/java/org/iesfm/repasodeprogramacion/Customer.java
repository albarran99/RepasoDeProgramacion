package org.iesfm.repasodeprogramacion;

import java.util.Objects;
import java.util.Set;

public class Customer {
    private String id;
    private String name;
    private String surname;
    private Set<Order> histoiry;

    public Customer(String id, String name, String surname, Set<Order> histoiry) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.histoiry = histoiry;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Set<Order> getHistoiry() {
        return histoiry;
    }

    public void setHistoiry(Set<Order> histoiry) {
        this.histoiry = histoiry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(name, customer.name) && Objects.equals(surname, customer.surname) && Objects.equals(histoiry, customer.histoiry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, histoiry);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", histoiry=" + histoiry +
                '}';
    }
}
