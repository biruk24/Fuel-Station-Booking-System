package Fuel_Station;

public class Booking {
    private String bookingNumber;
    private Vehicle vehicle;
    private String date;
    private String time;
    private String status;

    public Booking(String bookingNumber, Vehicle vehicle, String date, String time) {
        this.bookingNumber = bookingNumber;
        this.vehicle = vehicle;
        this.date = date;
        this.time = time;
        this.status = "Confirmed";
    }

    public String getBookingNumber() {
        return bookingNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status.equals("Confirmed") || status.equals("Cancelled")) {
            this.status = status;
        } else {
            System.out.println("Error: Status must be Confirmed or Cancelled");
        }
    }

    public void printDetails() {
        System.out.println("_____________________________________");
        System.out.println("Booking Number : " + bookingNumber);
        System.out.println("Status         : " + status);
        System.out.println("Date & Time    : " + date + " at " + time);
        System.out.println("Vehicle Info   : " + vehicle.getInfo());
        System.out.println("_____________________________________");
    }
}