package SystemDesign.parkinglot.parkingslot;

import SystemDesign.parkinglot.enums.DAYS;

public class LargeSlot extends ParkingSlot{
    
    @Override
    public int getCost(DAYS day) {
        int cost=10;
        if (day== DAYS.SATURDAY || day== DAYS.SUNDAY)
            cost+=2;
        return cost;
    }
}
