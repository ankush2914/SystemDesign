package FlipkartSystemDesign.Models;

import java.util.HashSet;

import FlipkartSystemDesign.Enums.StoryStatus;
import FlipkartSystemDesign.Enums.TicketType;

public class Story extends Ticket{
    StoryStatus storyStatus;
    public Story(String id, Ticket parent){
        this.storyStatus = StoryStatus.Open;
        this.id = id;
        this.parent = parent;
        this.subTasks = new HashSet<>();
        this.ticketType = TicketType.Story;
    }
    public String getId(){
        return this.id;
    }
    public void updateStatus(Ticket ticket){
        switch (this.storyStatus) {
            case StoryStatus.Open:
                    this.storyStatus = StoryStatus.InProgress;
                    break;
            case StoryStatus.InProgress:
                    this.storyStatus = StoryStatus.Testing;
                    break;
            case StoryStatus.Testing:
                    this.storyStatus = StoryStatus.InReview;
                    break;
            case StoryStatus.InReview:
                    for(Ticket subTicket: this.subTasks){
                        if(!subTicket.completedTicket(ticket)){
                            System.out.println("Sub tasks not completed");
                            return ;
                        }
                    }
                    this.storyStatus = StoryStatus.Deployed;
                    break;
            default:
                System.out.println("Already in deployed State");
                break;
        }
    }
    public boolean completedTicket(Ticket ticket){
        

        return this.storyStatus == StoryStatus.Deployed;
    }
    public void printStatus(){
        System.out.println("Status: "+this.storyStatus);
    }
}
