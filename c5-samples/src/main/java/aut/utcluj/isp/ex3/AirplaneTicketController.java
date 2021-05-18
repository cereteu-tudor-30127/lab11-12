package aut.utcluj.isp.ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author stefan
 */
public class AirplaneTicketController {
    private List<AirplaneTicket> tickets;
    
    public AirplaneTicketController() {
        tickets = new ArrayList<>();
    }
    
    /**
     * Add new airplane ticket
     *
     * @param airplaneTicket - airplane ticket object
     */
    public void addNewTicket(final AirplaneTicket airplaneTicket) {
        if(airplaneTicket != null){
            if(tickets.contains(airplaneTicket)){
                System.out.println("Ticket with id: " + airplaneTicket.getId() + "already exists.");
            }else{
                tickets.add(airplaneTicket);
                System.out.println("Ticket with id: " + airplaneTicket.getId() + "has been added.");
            }
        }
    }
    
    /**
     * Get all tickets
     *
     * @return
     */
    public List<AirplaneTicket> getTickets() {
        return tickets;
    }
    
    /**
     * Return total number of tickets
     */
    public int getTotalNumberOfTickets() {
        return tickets.size();
    }
    
    /**
     * Remove a specific ticket by ticket id
     *
     * @param ticketId - unique ticket id
     */
    public void removeTicketById(final String ticketId) {
        if(ticketId != null){
            for(int i = 0; i < tickets.size(); i++){
                if(tickets.get(i).getId().equals(ticketId)){
                    tickets.remove(i);
                }
            }
        }
//            boolean exists = false;
//            for(AirplaneTicket t : tickets){
//                if(t.getId().equals(ticketId)){
//                    tickets.remove(t);
//                }
//                exists = true;
//            }
//            if(exists == false){
//                System.out.println("Ticket with id: " + ticketId + "does not exist.");
//            }

//both work
    }
    
    /**
     * Update destination for a specific ticket
     *
     * @param ticketId    - unique ticket id
     * @param destination - new destination
     */
    public void updateTicketDestination(final String ticketId, final String destination) {
        if(ticketId != null) {
            for(AirplaneTicket t : tickets){
                if(t.getId().equals(ticketId)){
                    t.setDestination(destination);
                }
            }
        }
    }
    
    /**
     * Filter airplane tickets with price between [minPrice, maxPrice]
     *
     * @param minPrice - ticket min prince
     * @param maxPrice - ticket max price
     * @return
     */
    public List<AirplaneTicket> filterTicketsBetweenMinMaxPrice(final Double minPrice, final Double maxPrice) {
        List<AirplaneTicket> filteredTickets = new ArrayList<>();
        
        for(AirplaneTicket t : tickets){
            if(t.getPrice() <= maxPrice && t.getPrice() >= minPrice){
                filteredTickets.add(t);
            }
        }
        
        return filteredTickets;
    }
    
    /**
     * Filter airplane tickets with price between [minPrice, maxPrice] and destination
     *
     * @param minPrice    - ticket min price
     * @param maxPrice    - ticket max price
     * @param destination - destination
     * @return
     */
    public List<AirplaneTicket> filterTicketsWithPriceAndDestination(final Double minPrice, final Double maxPrice, final String destination) {
        List<AirplaneTicket> filteredTickets = new ArrayList<>();
        
        for(AirplaneTicket t : tickets){
            if(t.getPrice() <= maxPrice && t.getPrice() >= minPrice && t.getDestination().equals(destination)){
                filteredTickets.add(t);
            }
        }
        
        return filteredTickets;
    }
}
