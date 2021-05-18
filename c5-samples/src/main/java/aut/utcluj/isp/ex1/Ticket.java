package aut.utcluj.isp.ex1;

import java.util.Objects;

/**
 * @author stefan
 */
public class Ticket {
    private String id;
    private String customerName;
    private Double price;

    public Ticket(String customerName, Double price) {
        this.id = String.valueOf(Math.random());
        this.customerName = customerName;
        this.price = price;
    }

    public Ticket(String id, String customerName, Double price) {
        this.id = id;
        this.customerName = customerName;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ticket other = (Ticket) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.customerName, other.customerName)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        return true;
    }
}
