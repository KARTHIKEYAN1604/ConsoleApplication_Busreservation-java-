package BusReservationOwn;

import BusReservationOwn.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();
        SeatManager seatManager = new SeatManager();
        BusInput busInput = new BusInput();

        Scanner obj = new Scanner(System.in);
        int userOpt = 0;

        while (userOpt != 5) {
            System.out.println("\n--- Bus Reservation System ---");
            System.out.println("Enter 1 to Start Booking");
            System.out.println("Enter 2 to Add New Bus");
            System.out.println("Enter 3 to Display Available Seats by Date");
            System.out.println("Enter 4 to Cancel Booking");
            System.out.println("Enter 5 to Exit");
            userOpt = obj.nextInt();

            switch (userOpt) {
                case 1: {
                    Booking booking = new Booking();
                    if(seatManager.displayBuses(buses, booking))
                    	break ;
                    System.out.println("Select bus No:");
                    String busNo = obj.next();
                    System.out.println("Select seat number to book:");
                    int seatNumber = obj.nextInt();

                    boolean seatBooked = seatManager.bookSeat(buses, busNo, seatNumber);
                    if (seatBooked) {
                        // Find the booked bus
                        Bus bookedBus = null;
                        for (Bus bus : buses) {
                            if (bus.getBusNo().equals(busNo)) {
                                bookedBus = bus;
                                break;
                            }
                        }

                        // Set seat number in the booking and add to bookings list
                        booking.setSeatNum(seatNumber);
                        bookings.add(booking);

                        // Generate and display bill
                        BillGenerator.generateBill(booking, bookedBus);
                    }
                    break;
                }
                case 2: {
                    Bus newBus = busInput.getBusFromInput();
                    buses.add(newBus);
                    break;
                }
                case 3: {
                    Booking booking = new Booking();
                    seatManager.displayBuses(buses, booking);
                    break;
                }
                case 4: {
                    System.out.println("Enter Bus Number: ");
                    String busNo = obj.next();
                    System.out.println("Enter Seat Number to Cancel:");
                    int seatNumber = obj.nextInt();
                    seatManager.cancelSeat(buses, busNo, seatNumber);
                    break;
                }
                case 5: {
                    System.out.println("Exiting the Bus Reservation System.");
                    break;
                }
                default: {
                    System.out.println("Invalid option. Please enter a valid option.");
                }
            }
        }
    }
}
