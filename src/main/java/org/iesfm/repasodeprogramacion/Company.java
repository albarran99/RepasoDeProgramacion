package org.iesfm.repasodeprogramacion;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class Company {
    private String name;
    private int cif;
    private HashMap<String, Customer> customers;

    public Company(String name, int cif, HashMap<String, Customer> customers) {
        this.name = name;
        this.cif = cif;
        this.customers = customers;
    }

    public Set<Order> getCustomerOders(String idCustomer) throws CustomersNotFoundException {

        if(!customers.containsKey(idCustomer)) {
            throw  new CustomersNotFoundException(idCustomer);
        }

        return customers.get(idCustomer).getHistoiry();
    }

    public int getOrderPrice(String idCustomer, int numOrder) throws CustomersNotFoundException, OrderNotFoundException{
        Set<Order> orders = getCustomerOders(idCustomer);

        Order customerOrder = null;

        for(Order order : orders) {
            if(order.getNumOrder() == numOrder) {
                customerOrder = order;
           }
        }
        if (customerOrder == null) {
            throw new OrderNotFoundException(numOrder);
        }

        return customerOrder.price();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCif() {
        return cif;
    }

    public void setCif(int cif) {
        this.cif = cif;
    }

    public HashMap<String, Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(HashMap<String, Customer> customers) {
        this.customers = customers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return cif == company.cif && Objects.equals(name, company.name) && Objects.equals(customers, company.customers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cif, customers);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", cif=" + cif +
                ", customers=" + customers +
                '}';
    }
}
