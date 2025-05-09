package FlipkartSystemDesign.ServiceManager;

import java.util.*;

import FlipkartSystemDesign.Enums.TicketType;
import FlipkartSystemDesign.Models.Ticket;
public class SprintManager {
    private Set<Ticket> sprint;
    private Set<TicketType> allowedTicketTypes;
    public SprintManager(){
        sprint = new HashSet<>();
        allowedTicketTypes = new HashSet<>();
    }
    public boolean addTicket(Ticket ticket){
        if(!checkAllowed(ticket))
            return false;
        if(sprint.contains(ticket)){
            System.out.println("Sprint already has this story!");
            return false;
        }
        else{
            sprint.add(ticket);
            return true;
        }
    }
    public boolean removeTicket(Ticket ticket){
        if(!checkAllowed(ticket))
            return false;
        if(!sprint.contains(ticket)){
            System.out.println("Sorry. Sprint doesn't have this story!");
            return false;
        }
        else{
            sprint.remove(ticket);
            return true;
        }
    }
    public List<Ticket> getTicket(){
        List<Ticket> list = new ArrayList<>();
        for(Ticket ticket: sprint){
            list.add(ticket);
        } 
        return list;
    }
    public void printTicket(){
        System.out.print("List of Tikects: ");
        for(Ticket ticket: sprint){
            System.out.print(ticket.getId()+" | ");
        }
        System.out.println();
    }
    private boolean checkAllowed(Ticket ticket){
        if(allowedTicketTypes.contains(ticket.ticketType)){
            return true;
        } 
        else{
            System.out.println("Type is not allowed!");
            return false;
        }
    }
    public void addAllowedTypes(TicketType ticketType){
        allowedTicketTypes.add(ticketType);
    }
    public void removeAllowedTypes(TicketType ticketType){
        allowedTicketTypes.remove(ticketType);
    }
}

