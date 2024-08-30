package BusReservationOwn;

import java.util.Date;

public class Bus {

    private String busNo;
    private int capacity;
    private boolean AC;
    private String driverName;
    private String from;
    private String to;
    private String timing;
    private int duration;
    private int ticket;
    private Date date;
    private boolean[] seats;

    public Bus(String busNo, int capacity, boolean ac, String driverName, String from, String to, String timing, int duration, int price, Date date) {
        this.busNo = busNo;
        this.capacity = capacity;
        this.AC = ac;
        this.driverName = driverName;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.timing = timing;
        this.ticket = price;
        this.date = date;
        this.seats = new boolean[capacity];
        System.out.println("New Bus Added Successfully!");
    }

    // Getters
    public String getBusNo() {
        return busNo;
    }

    public String getDriverName() {
        return driverName;
    }

    public boolean isAc() {
        return AC;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getDuration() {
        return duration;
    }

    public String getTiming() {
        return timing;
    }

    public Date getDate() {
        return date;
    }

    public int getTicket() {
        return ticket;
    }

    public boolean[] getSeats() {
        return seats;
    }

    // Display available seats
    public void displayAvailableSeats() {
        System.out.println("Available seats for Bus No: " + busNo);
        for (int i = 0; i < capacity; i++) {
            if (!seats[i]) 
                System.out.print((i + 1+" "));
            else
            	System.out.print("[B]");
            if((i+1)%5 == 0)
            	System.out.println();
            
        }
        System.out.println();
    }

    // Book a seat
    public boolean bookSeat(int seatNumber) {
        if (seatNumber > 0 && seatNumber <= capacity && !seats[seatNumber - 1]) {
            seats[seatNumber - 1] = true;
            System.out.println("Seat " + seatNumber + " booked successfully!");
            return true;
        } else {
            System.out.println("Seat " + seatNumber + " is not available.");
            return false;
        }
    }

    // Cancel a seat
    public boolean cancelSeat(int seatNumber) {
        if (seatNumber > 0 && seatNumber <= capacity && seats[seatNumber - 1]) {
            seats[seatNumber - 1] = false;
            System.out.println("Seat " + seatNumber + " canceled successfully!");
            return true;
        } else {
            System.out.println("Seat " + seatNumber + " is not booked.");
            return false;
        }
    }
}
