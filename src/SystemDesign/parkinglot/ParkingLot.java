package SystemDesign.parkinglot;

import SystemDesign.parkinglot.parkingentities.ParkingAttendant;
import SystemDesign.parkinglot.parkingentities.ParkingFloor;
import SystemDesign.parkinglot.parkingslot.ParkingSlot;
import SystemDesign.parkinglot.terminal.EntryTerminal;
import SystemDesign.parkinglot.terminal.ExitTerminal;

import java.util.List;

public class ParkingLot {
    
    List<ParkingFloor> parkingFloors;
    List<EntryTerminal> entryGates;
    List<ExitTerminal> exitGates;
    public boolean isParkingSpaceAvailable(ParkingSlot slot) {
        return true;
    }
    public void updateParkingAttendant(ParkingAttendant parkingAttendant,int terminalId){
        
    }
    
    
}
