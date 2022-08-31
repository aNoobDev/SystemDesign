package SystemDesign.parkinglot.parkingslot;

import SystemDesign.parkinglot.enums.DAYS;
import SystemDesign.parkinglot.parkingentities.Vehicle;

public abstract class ParkingSlot {
    
    boolean isAvailable;
    int slotId;
    Vehicle vehicle;
    public abstract int getCost(DAYS day);
    
}
