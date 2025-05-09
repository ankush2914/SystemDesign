package FlipkartSystemDesign.Models;

import java.util.HashSet;

import FlipkartSystemDesign.Enums.EpicStatus;
import FlipkartSystemDesign.Enums.TicketType;

public class Epic extends Ticket{
    EpicStatus epicStatus;
    public Epic(String id, Ticket parent){
        this.epicStatus = EpicStatus.Open;
        this.id = id;
        this.parent = parent;
        this.subTasks = new HashSet<>();
        this.ticketType = TicketType.Epic;
    }
    public String getId(){
        return this.id;
    }
    public void updateStatus(Ticket ticket){
        switch (this.epicStatus) {
            case EpicStatus.Open:
                    this.epicStatus = EpicStatus.InProgress;
                    break;
            case EpicStatus.InProgress:
                    this.epicStatus = EpicStatus.Completed;
                    break;
            default:
                System.out.println("Already in Completed State");
                break;
        }
    }
    public boolean completedTicket(Ticket ticket){
        return this.epicStatus == EpicStatus.Completed;
    }
    public void printStatus(){
        System.out.println("Status: "+this.epicStatus);
    }
}
