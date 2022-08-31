package SystemDesign.parkinglot.parkingentities;

import SystemDesign.parkinglot.payment.PaymentInfo;
import SystemDesign.parkinglot.payment.PaymentService;
import SystemDesign.parkinglot.payment.PaymentType;

public class ExitGateParkingAttendant implements ParkingAttendant{

    PaymentService paymentService;

    public PaymentInfo processPayment(Ticket ticket, PaymentType paymentType){
        return null;
    }
}
