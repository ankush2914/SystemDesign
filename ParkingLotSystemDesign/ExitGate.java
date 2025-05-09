package ParkingLotSystemDesign;

import java.util.Map;

public class ExitGate {
    private Map<VehicleType, ParkingSpotManager> registry;
    public ExitGate(Map<VehicleType, ParkingSpotManager> registry) {
        this.registry = registry;
    }
    double calculateTicketCost(Ticket ticket){
        ParkingSpotManager parkingSpotManager = registry.get(ticket.getVehicle().getVehicleType());
        ticket.getParkingSpot().unpark(ticket.getVehicle());
        return parkingSpotManager.calculateCost();
    }
}
