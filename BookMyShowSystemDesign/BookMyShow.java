package BookMyShowSystemDesign;

import java.util.*;
public class BookMyShow {
    List<Ticket> bookedTickets;
    
    public BookMyShow() {
        this.bookedTickets = new ArrayList<>();
    }
    public Ticket bookTicket(User user, Show show, Seat seat){
        if(seat.isAvailable()){
            Ticket ticket = new Ticket(show, seat, user,100+seat.getSeatType().ordinal()*20);
            seat.setAvailable(false);
            System.out.println("Ticket Booked for "+show.getMovie().getMovieName()+" starting at "+show.getStartTime());
            bookedTickets.add(ticket);
            return ticket;
        }
        else{
            System.out.println("Seat not available!!");
            return null;
        }
    }
    public void cancelTicket(Ticket ticket){
        if(ticket!=null){
            bookedTickets.remove(ticket);
            ticket.seat.setAvailable(true);
        }
    }
}
