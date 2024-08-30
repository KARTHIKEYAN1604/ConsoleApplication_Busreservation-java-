package BusReservationOwn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BusInput {

    public Bus getBusFromInput() {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Bus Number: ");
        String busNo = obj.next();

        System.out.println("Enter Capacity: ");
        int capacity = obj.nextInt();

        System.out.println("Is the bus AC? (true/false): ");
        boolean ac = obj.nextBoolean();

        System.out.println("Enter Driver Name: ");
        String driverName = obj.next();

        System.out.println("Enter From Location: ");
        String from = obj.next();

        System.out.println("Enter To Location: ");
        String to = obj.next();
        
        System.out.println("Enter Duration (in hours): ");
        int duration = obj.nextInt();

        System.out.println("Enter Ticket Price: ");
        int price = obj.nextInt();

        System.out.println("Enter timing (from-to) (AM/PM): ");
        String timing = obj.next();

       
        System.out.println("Enter Date (dd-MM-yyyy): ");
        String dateInput = obj.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;

        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return new Bus(busNo, capacity, ac, driverName, from, to, timing, duration, price, date);
    }
}
