package FlipkartSystemDesign;

import FlipkartSystemDesign.Enums.TicketType;
import FlipkartSystemDesign.Models.Ticket;
import FlipkartSystemDesign.ServiceManager.SprintManager;
import FlipkartSystemDesign.ServiceManager.TicketManager;

public class Main {
    public static void main(String[] args) {
        SprintManager sm1 = new SprintManager();
        TicketManager tm1 = new TicketManager();
        Ticket s1 = tm1.createTicket(TicketType.Story, "S01",null);
        Ticket ep1 = tm1.createTicket(TicketType.Epic, "E01",null);
        // Ticket on1 = tm1.createTicket(TicketType.OnCall, "O01",null);
        s1.printStatus();
        tm1.updateTicket(s1);
        tm1.updateTicket(s1);
        s1.printStatus();
        tm1.updateTicket(ep1);
        tm1.updateTicket(ep1);
        tm1.updateTicket(ep1);
        ep1.printStatus();
        sm1.addAllowedTypes(TicketType.Story);
        sm1.addTicket(s1);
        sm1.addTicket(ep1);
        sm1.printTicket();
        sm1.addAllowedTypes(TicketType.Epic);
        sm1.addTicket(ep1);
        sm1.printTicket();
        sm1.removeTicket(s1);
        sm1.printTicket();
        Ticket subtask1 = tm1.createTicket(TicketType.Story, "E02",s1);
        s1.displaySub();
        subtask1.printStatus();
        tm1.updateTicket(s1);
        tm1.updateTicket(s1);
        tm1.updateTicket(s1);
        s1.printStatus();
        // sm1.removeTicket(s2);
        // sm1.printTicket();
        // s1.printStatus();
        // tm1.updateTicket(s1);
        // s1.printStatus();
        // Ticket s3 = tm1.createTicket(TicketType.Story, "S03",s1);
        // s3.printStatus();
        // Ticket ep1 = tm1.createTicket(TicketType.Epic, "S03",s1);
        // tm1.removeTicket(s1);
        // s3.updateStatus(ep1);
        // s3.printStatus();
        // s3.updateStatus(ep1);
        // s3.printStatus();
        // s3.updateStatus(ep1);
        // s3.printStatus();
        // s3.updateStatus(ep1);
        // s3.printStatus();
        // tm1.removeTicket(s1);
    }
}
