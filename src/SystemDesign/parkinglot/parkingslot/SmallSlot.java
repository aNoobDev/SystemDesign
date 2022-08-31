package SystemDesign.parkinglot.parkingslot;

import SystemDesign.parkinglot.enums.DAYS;

public class SmallSlot extends ParkingSlot{

    public SmallSlot(){
        
        
    }
    
    @Override
    public int getCost(DAYS day) {
        int cost=2;
        if (day== DAYS.SATURDAY || day== DAYS.SUNDAY)
            cost+=2;
        return cost;
    }
}
