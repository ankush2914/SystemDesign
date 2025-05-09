package ParkingLotSystemDesign;

import java.util.*;

public class EntryGate {
    private Map<VehicleType, ParkingSpotManager> registry;
    public EntryGate(Map<VehicleType, ParkingSpotManager> registry) {
        this.registry = registry;
    }
    public Ticket generateTicket(Vehicle vehicle){
        ParkingSpotManager parkingSpotManager = registry.get(vehicle.getVehicleType());
        ParkingSpot parkingSpot = parkingSpotManager.freeParkingSpot();
        if(parkingSpot!=null){
            parkingSpot.park(vehicle);
            Ticket ticket = new Ticket(parkingSpot, vehicle);
            return ticket;
        }
        else{
            System.out.println("Parking Spot not available!!!");
            return null;
        }
    }
}
