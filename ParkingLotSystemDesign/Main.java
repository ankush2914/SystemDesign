package ParkingLotSystemDesign;

public class Main {
    public static void main(String[] args) {
        ParkingSpotManagerRegistry psmr1 = new ParkingSpotManagerRegistry();
        EntryGate entryGate1 = new EntryGate(psmr1.getManagerMap());
        ExitGate exitGate1 = new ExitGate(psmr1.getManagerMap());
        ParkingSpotManager twm1 = psmr1.getManager(VehicleType.TWO_WHEELER);
        ParkingSpotManager fwm1 = psmr1.getManager(VehicleType.FOUR_WHEELER);
        Vehicle[] vehicles = new Vehicle[10];
        for(int i = 0; i< 10; ++i ){
            if(i%2==0)
                vehicles[i] = new Vehicle("UP32 000"+Integer.toString(i), VehicleType.TWO_WHEELER);
            else
                vehicles[i] = new Vehicle("UP32 000"+Integer.toString(i), VehicleType.FOUR_WHEELER);
        }
        twm1.displaySpots();
        fwm1.displaySpots();
        Ticket t1 = entryGate1.generateTicket(vehicles[0]);
        Ticket t2 = entryGate1.generateTicket(vehicles[1]);
        twm1.displaySpots();
        fwm1.displaySpots();
        System.out.println(exitGate1.calculateTicketCost(t2));
        twm1.displaySpots();
        fwm1.displaySpots();
        System.out.println(exitGate1.calculateTicketCost(t1));
    }
}
