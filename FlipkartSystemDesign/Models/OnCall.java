package FlipkartSystemDesign.Models;

import java.util.HashSet;

import FlipkartSystemDesign.Enums.OnCallStatus;
import FlipkartSystemDesign.Enums.TicketType;

public class OnCall extends Ticket {
    OnCallStatus onCallStatus;
    public OnCall(String id, Ticket parent){
        this.onCallStatus = OnCallStatus.Open;
        this.id = id;
        this.parent = parent;
        this.subTasks = new HashSet<>();
        this.ticketType = TicketType.OnCall;
    }
    public String getId(){
        return this.id;
    }
    public void updateStatus(Ticket ticket){
        switch (this.onCallStatus) {
            case OnCallStatus.Open:
                    this.onCallStatus = OnCallStatus.InProgress;
                    break;
            case OnCallStatus.InProgress:
                    this.onCallStatus = OnCallStatus.Resolved;
                    break;
            default:
                System.out.println("Already in Resolved State");
                break;
        }
    }
    public boolean completedTicket(Ticket ticket){
        return this.onCallStatus == OnCallStatus.Resolved;
    }
    public void printStatus(){
        System.out.println("Status: "+this.onCallStatus);
    }
}
