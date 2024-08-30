package BusReservationOwn;

import java.text.SimpleDateFormat;

public class BillGenerator {

    public static void generateBill(Booking booking, Bus bus) {
        System.out.println("\n----- Booking Receipt -----");

        // Passenger details
        System.out.println("Booking Number: " + booking.getBookingNumber());
        System.out.println("Passenger Name: " + booking.getPassengerName());
        System.out.println("Phone Number  : " + booking.getPhoneNum());
        System.out.println("Email         : " + booking.getEmail());
        System.out.println("Seat Number   : " + booking.getSeatNum());

        // Bus details
        System.out.println("\n----- Bus Details -----");
        System.out.println("Bus Number    : " + bus.getBusNo());
        System.out.println("From          : " + bus.getFrom());
        System.out.println("To            : " + bus.getTo());
        System.out.println("Driver Name   : " + bus.getDriverName());
        System.out.println("Timing        : " + bus.getTiming());
        System.out.println("Duration      : " + bus.getDuration() + " hours");
        System.out.println("Ticket Price  : " + bus.getTicket() + "INR");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Travel Date   : " + dateFormat.format(bus.getDate()));

        System.out.println("\n----- Thank You for Booking! -----");
    }
}
