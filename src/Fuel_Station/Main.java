package Fuel_Station;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Booking> bookings = new ArrayList<>();

    static int bookingCounter = 0;

    static Scanner scanner = new Scanner(System.in);

    static String makeBooking(Vehicle vehicle, String date, String time) {
        bookingCounter++;
        String number = "FSB-" + bookingCounter;
        Booking bkk = new Booking(number, vehicle, date, time);

        bookings.add(bkk);
        return number;
    }

    static String makeBooking(Vehicle vehicle, String date) {
        return makeBooking(vehicle, date, "08:30");
    }

    static String makeBookingTruck(Vehicle vehicle, String date) {
        return makeBooking(vehicle, date, "08:30");
    }

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("      Fuel Station Booking              ");
        System.out.println("==========================================");

        boolean running = true;

        while (running) {
            System.out.println("--- MAIN MENU ---");
            System.out.println("1. Book for Car");
            System.out.println("2. Book for Motorcycle");
            System.out.println("3. Book for Truck");
            System.out.println("4. Check book");
            System.out.println("5. Cancel book");
            System.out.println("6. View All bookings");
            System.out.println("7. Exit");
            System.out.print("Choose: ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                bookCar();
            } else if (choice.equals("2")) {
                Motorcycle();
            }else if (choice.equals("3")) {
                bookTruck();
            } else if (choice.equals("4")) {
                checkBook();
            } else if (choice.equals("5")) {
                cancelBook();
            } else if (choice.equals("6")) {
                viewAll();
            } else if (choice.equals("7")) {
                System.out.println("Goodbye");
                running = false;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }

    static void bookCar() {System.out.println("--- Book for Car  ---");

        System.out.print("Your Name: ");
        String name = scanner.nextLine();

        System.out.print("Plate Number: ");
        String plate = scanner.nextLine();

        System.out.print("Fuel Type (Petrol/Diesel): ");
        String fuel = scanner.nextLine();

        System.out.print("Date: ");
        String date = scanner.nextLine();

        System.out.print("Time (or press Enter for 08:30): ");
        String time = scanner.nextLine();

        Vehicle vehicle = new Car(name, plate, fuel);
        String number;
        if (time.isEmpty()) {
            number = makeBooking(vehicle, date);
        } else {
            number = makeBooking(vehicle, date, time);
        }

        System.out.println("Booking Confirmed!");
        System.out.println("  Your Booking Number: " + number);
        System.out.println("  Show this number at the station.");
    }
    {System.out.println("--- Book for Car  ---");

        System.out.print("Your Name: ");
        String name = scanner.nextLine();

        System.out.print("Plate Number: ");
        String plate = scanner.nextLine();

        System.out.print("Fuel Type (Petrol/Diesel): ");
        String fuel = scanner.nextLine();

        System.out.print("Date: ");
        String date = scanner.nextLine();

        System.out.print("Time (or press Enter for 08:30): ");
        String time = scanner.nextLine();

        Vehicle vehicle = new Car(name, plate, fuel);
        String number;
        if (time.isEmpty()) {
            number = makeBooking(vehicle, date);
        } else {
            number = makeBooking(vehicle, date, time);
        }

        System.out.println("Booking Confirmed!");
        System.out.println("  Your Booking Number: " + number);
        System.out.println("  Show this number at the station.");
    }


    static void Motorcycle() {System.out.println("--- Book for Motorcycle  ---");

        System.out.print("Your Name: ");
        String name = scanner.nextLine();

        System.out.print("Plate Number: ");
        String plate = scanner.nextLine();

        System.out.print("Date: ");
        String date = scanner.nextLine();

        System.out.print("Time (or press Enter for 08:30): ");
        String time = scanner.nextLine();

        Vehicle vehicle = new Motorcycle(name, plate);
        String number;
        if (time.isEmpty()) {
            number = makeBooking(vehicle, date);
        } else {
            number = makeBooking(vehicle, date, time);
        }

        System.out.println("Booking Confirmed!");
        System.out.println("  Your Booking Number: " + number);
        System.out.println("  Show this number at the station.");
    }
    {System.out.println("--- Book for Motorcycle  ---");

        System.out.print("Your Name: ");
        String name = scanner.nextLine();

        System.out.print("Plate Number: ");
        String plate = scanner.nextLine();


        System.out.print("Date: ");
        String date = scanner.nextLine();

        System.out.print("Time (or press Enter for 08:30): ");
        String time = scanner.nextLine();

        Vehicle vehicle = new Motorcycle(name, plate);
        String number;
        if (time.isEmpty()) {
            number = makeBooking(vehicle, date);
        } else {
            number = makeBooking(vehicle, date, time);
        }

        System.out.println("Booking Confirmed!");
        System.out.println("  Your Booking Number: " + number);
        System.out.println("  Show this number at the station.");
    }



    static void bookTruck() {
        System.out.println("--- Book for Truck  ---");

        System.out.print("Your Name: ");
        String name = scanner.nextLine();

        System.out.print("Plate Number: ");
        String plate = scanner.nextLine();

        System.out.print("Is trailer? (yes/no): ");
        String trailer = scanner.nextLine();

        boolean istrailer = trailer.equalsIgnoreCase("yes");
        System.out.print("Date: ");
        String date = scanner.nextLine();

        System.out.print("Time (or press Enter for 09:00): ");
        String time = scanner.nextLine();

        Vehicle vehicle = new Truck(name, plate,trailer ,istrailer);

        String number;
        if (time.isEmpty()) {
            number = makeBookingTruck(vehicle, date);
        } else {
            number = makeBooking(vehicle, date, time);
        }

        System.out.println("Booking Confirmed!");
        System.out.println("  Your Booking Number: " + number);
        System.out.println("  Show this number at the station.");
    }

    static void checkBook() {
        System.out.println("--- Check Appointment ---");
        System.out.print("Enter Booking Number (e.g. FSB-1): ");
        String number = scanner.nextLine();

        Booking found = findBooking(number);
        if (found != null) {
            found.printDetails();
        } else {
            System.out.println("No Booking found with number: " + number);
        }
    }

    static void cancelBook() {
        System.out.println("--- Cancel Booking ---");
        System.out.print("Enter Booking Number to cancel: ");
        String number = scanner.nextLine();

        Booking found = findBooking(number);
        if (found != null) {
            found.setStatus("Cancelled");
            System.out.println("Booking " + number + " has been cancelled.");
        } else {
            System.out.println("No Booking found with number: " + number);
        }
    }
    static void viewAll() {
        System.out.println("--- All Bookings ---");
        if (bookings.isEmpty()) {
            System.out.println("No bookings yet.");
            return;
        }
        for (Booking a : bookings) {
            a.printDetails();
        }
        System.out.println("Total: " + bookings.size() + " Booking(s).");
    }

    static Booking findBooking(String number) {
        for (Booking a : bookings) {
            if (a.getBookingNumber().equalsIgnoreCase(number)) {
                return a;
            }
        }
        return null;
    }
}

