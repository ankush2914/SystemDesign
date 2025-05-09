package BookMyShowSystemDesign;

public class Seat {
    private int id;
    private SeatType seatType;
    private boolean available;
    public Seat(int id, SeatType seatType) {
        this.id = id;
        this.seatType = seatType;
        this.available = true;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public SeatType getSeatType() {
        return seatType;
    }
    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
