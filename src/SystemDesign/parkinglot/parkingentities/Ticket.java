package SystemDesign.parkinglot.parkingentities;

import SystemDesign.parkinglot.parkingslot.ParkingSlot;

public class Ticket {
    
    int inTime;
    int outTime;
    int totalCost;
    Vehicle vehicle;
    ParkingSlot slot;
    int slotId;
    int floorId;
    
    public void updateTotalCost(){};
    
    public void updateExitTime(int outTime){};
    
    
    
}
