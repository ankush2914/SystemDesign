package ParkingLotSystemDesign;

import java.util.ArrayList;

public class FWPSManager extends ParkingSpotManager{
    public FWPSManager() {
        super(new ArrayList<>());
        for(int i = 0; i< 10; ++i){
            this.addParkingSpot(new ParkingSpot(i,50));
        }
    }
    @Override
    public double calculateCost() {
        return 100;
    }
}
