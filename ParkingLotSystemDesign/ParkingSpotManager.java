package ParkingLotSystemDesign;

import java.util.*;

public class ParkingSpotManager {
    List<ParkingSpot> parkingSpots;
    public ParkingSpotManager(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
    public void addParkingSpot(ParkingSpot parkingSpot){
        parkingSpots.add(parkingSpot);
    }
    public void removeParkingSpot(ParkingSpot parkingSpot){
        parkingSpots.remove(parkingSpot);
    }
    public ParkingSpot freeParkingSpot(){
        for(ParkingSpot parkingSpot: parkingSpots){
            if(parkingSpot.isAvailable())
                return parkingSpot;
        }
        return null;
    }
    public double calculateCost(){
        return 0;
    }
    public void displaySpots(){
        System.out.println("List of Parking spots: ");
        for(ParkingSpot parkingSpot: parkingSpots){
            System.out.println("ID: "+parkingSpot.getId()+ " Available: "+ parkingSpot.isAvailable());
        }
    }
}
