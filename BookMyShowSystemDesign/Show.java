package BookMyShowSystemDesign;

import java.util.*;

public class Show {
    private List<Seat> seats;
    private Movie movie;
    private int startTime;
    public Show(List<Seat> seats, Movie movie, int startTime) {
        this.seats = seats;
        this.movie = movie;
        this.startTime = startTime;
    }
    public List<Seat> availableSeats(){
        List<Seat> availableList = new ArrayList<>();
        for(Seat seat: seats){
            if(seat.isAvailable())
                availableList.add(seat);
        }
        return availableList;
    }
    public void showAvailableSeats(){
        for(Seat seat: seats){
            if(seat.isAvailable())
                System.out.print("["+seat.getId()+": "+seat.getSeatType()+"] ");
        }
        System.out.println();
    }
    public Movie getMovie() {
        return movie;
    }
    public int getStartTime() {
        return startTime;
    }
}
