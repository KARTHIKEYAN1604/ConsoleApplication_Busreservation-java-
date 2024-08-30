package BusReservationOwn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Booking {

    private static int bookingCounter = 1000;
    private String bookingNumber;
    private String passengerName;
    private String phoneNum;
    private String email;
    private String from;
    private String to;
    private Date date;
    private int seatNum;

    public Booking() {
        Scanner obj = new Scanner(System.in);
        this.bookingNumber = "BID" + (++bookingCounter);

        System.out.println("Enter your name:");
        this.passengerName = obj.nextLine();

        System.out.println("Enter your phone number:");
        this.phoneNum = obj.nextLine();

        System.out.println("Enter your email:");
        this.email = obj.nextLine();

        System.out.println("Enter your starting point:");
        this.from = obj.nextLine();

        System.out.println("Enter your destination:");
        this.to = obj.nextLine();

        System.out.println("Enter date (dd-MM-yyyy): ");
        String dateInput = obj.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            this.date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    // Getters
    public String getBookingNumber() {
    	return bookingNumber;
    }
    public String getPassengerName() {
    	return passengerName;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    public String getEmail() {
        return email;
    }
    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Date getDate() {
        return date;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }
}
