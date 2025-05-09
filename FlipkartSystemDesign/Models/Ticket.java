package FlipkartSystemDesign.Models;

import java.util.*;

import FlipkartSystemDesign.Enums.TicketType;
abstract public class Ticket {
    String id;
    Ticket parent;
    public TicketType ticketType;
    public Set<Ticket>subTasks;
    public abstract void updateStatus(Ticket ticket);
    public abstract boolean completedTicket(Ticket ticket);
    public abstract void printStatus();
    public abstract String getId();
    public void displaySub(){
        System.out.print("List of subTaks:");
        for(Ticket ticket: this.subTasks){
            System.out.print(ticket.getId()+ " | ");
        }
        System.out.println();
    }
}

