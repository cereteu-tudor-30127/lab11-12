package aut.utcluj.isp.ex2;

/**
 * @author stefan
 */
public class AirplaneTicket extends Ticket{
    private String destination;

    public AirplaneTicket(String id, String customerName, Double price, String destination) {
//        Ticket ticket = new Ticket(id, customerName, price);
        super(id, customerName, price);
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }
}
