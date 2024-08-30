package BusReservationOwn;

import java.util.ArrayList;

public class SeatManager {

    // Display buses for a particular route and date
    public boolean displayBuses(ArrayList<Bus> buses, Booking booking) {
        boolean found = false;
        for (Bus bus : buses) {
            if (bus.getFrom().equals(booking.getFrom()) &&
            		bus.getTo().equals(booking.getTo()) && 
            		      bus.getDate().equals(booking.getDate()))
            {
                System.out.println("Bus No: " + bus.getBusNo() + "/nFrom: " + bus.getFrom() + "/nTo: " + bus.getTo() + "/nTiming: " + bus.getTiming());
                bus.displayAvailableSeats();
                found = true;
                return true;
            }
        }
        if (!found) {
            System.out.println("No buses available for the selected route and date.");
        }
        return false;
    }
 
    

    // Book a seat on a particular bus
    public boolean bookSeat(ArrayList<Bus> buses, String busNo, int seatNumber) {
        for (Bus bus : buses) {
            if (bus.getBusNo().equals(busNo)) {
                if(bus.bookSeat(seatNumber))
                	return true;
            }
        }
        return false;
    }

    // Cancel a seat on a particular bus
    public void cancelSeat(ArrayList<Bus> buses, String busNo, int seatNumber) {
        for (Bus bus : buses) {
            if (bus.getBusNo().equals(busNo)) {
                bus.cancelSeat(seatNumber);
            }
        }
    }
}
