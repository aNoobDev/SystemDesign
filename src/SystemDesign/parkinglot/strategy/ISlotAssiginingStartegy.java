package SystemDesign.parkinglot.strategy;

import SystemDesign.parkinglot.parkingslot.ParkingSlot;

public interface ISlotAssiginingStartegy {
    
    public ParkingSlot findSlot();
}
