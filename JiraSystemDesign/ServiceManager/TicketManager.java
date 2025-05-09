package FlipkartSystemDesign.ServiceManager;

import java.util.*;

import FlipkartSystemDesign.Enums.TicketType;
import FlipkartSystemDesign.Models.Epic;
import FlipkartSystemDesign.Models.OnCall;
import FlipkartSystemDesign.Models.Story;
import FlipkartSystemDesign.Models.Ticket;

public class TicketManager {
    Set<Ticket>tickets;
    Set<String> ids;
    public TicketManager(){
        tickets = new HashSet<>();
        ids = new HashSet<>();
    }
    public Ticket createTicket(TicketType ticketType, String id, Ticket parent){
        if(parent !=null && parent.ticketType !=ticketType){
            System.out.println("Same type can create subtasks");
            return null;
        }
        if(ids.contains(id)){
            return null;
        }
        switch (ticketType) {
            case TicketType.Epic ->{
                Ticket ticket = new Epic(id, parent);
                tickets.add(ticket);
                ids.add(id);
                if(parent !=null) parent.subTasks.add(ticket);
                return ticket;
            }
            case TicketType.Story -> {
                Ticket ticket = new Story(id, parent);
                tickets.add(ticket);
                ids.add(id);
                if(parent !=null) parent.subTasks.add(ticket);
                return ticket;
            }
            case TicketType.OnCall -> {
                Ticket ticket = new OnCall(id, parent);
                tickets.add(ticket);
                ids.add(id);
                if(parent !=null) parent.subTasks.add(ticket);
                return ticket;
            }
            default ->{
                return null;
            }
        }
    }
    public void updateTicket(Ticket ticket){
        ticket.updateStatus(ticket);
    }
    public void removeTicket(Ticket ticket){
        boolean allsubTask = true;
        for (Ticket subTicket: ticket.subTasks){
            removeTicket(subTicket);
            if(!subTicket.completedTicket(ticket)){
                allsubTask = false;
                System.out.println("Sub Tasks not Completed!");
                break;
            }
            else{
                ticket.subTasks.remove(subTicket);
            }
        }
        if(allsubTask){
            tickets.remove(ticket);
        }
    }
}
