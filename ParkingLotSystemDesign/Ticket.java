package ParkingLotSystemDesign;

import java.time.LocalDateTime;

public class Ticket {
    private ParkingSpot parkingSpot;
    private LocalDateTime entryTime;
    private Vehicle vehicle;
    public Ticket(ParkingSpot parkingSpot, Vehicle vehicle) {
        this.parkingSpot = parkingSpot;
        this.entryTime = LocalDateTime.now();
        this.vehicle = vehicle;
    }
    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
    public LocalDateTime getEntryTime() {
        return entryTime;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
}
