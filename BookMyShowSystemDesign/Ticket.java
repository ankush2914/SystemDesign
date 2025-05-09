package BookMyShowSystemDesign;

public class Ticket {
    Show show;
    Seat seat;
    User user;
    private int price;
    public Ticket(Show show, Seat seat, User user, int price) {
        this.show = show;
        this.seat = seat;
        this.user = user;
        this.price = price;
    }
    public Show getShow() {
        return show;
    }
    public Seat getSeat() {
        return seat;
    }
    public User getUser() {
        return user;
    }
    public int getPrice() {
        return price;
    }
}
