package ParkingLotSystemDesign;

import java.util.*;
public class TWPSManager extends ParkingSpotManager{

    public TWPSManager() {
        super(new ArrayList<>());
        for(int i = 0; i< 10; ++i){
            this.addParkingSpot(new ParkingSpot(i,10));
        }
    }
    @Override
    public double calculateCost() {
        return 50;
    }
}
