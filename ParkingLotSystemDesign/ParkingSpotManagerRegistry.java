package ParkingLotSystemDesign;

import java.util.*;

public class ParkingSpotManagerRegistry {
    private final Map<VehicleType, ParkingSpotManager> managerMap = new HashMap<>();

    public ParkingSpotManagerRegistry() {
        managerMap.put(VehicleType.TWO_WHEELER, new TWPSManager());
        managerMap.put(VehicleType.FOUR_WHEELER, new FWPSManager());
    }

    public ParkingSpotManager getManager(VehicleType vehicleType) {
        return managerMap.get(vehicleType);
    }

    public Map<VehicleType, ParkingSpotManager> getManagerMap() {
        return managerMap;
    }
}