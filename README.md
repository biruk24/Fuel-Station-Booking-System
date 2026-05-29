Fuel Station Booking System

MVP Overview
The system provides a fuel station to manage vehicle service bookings through a simple text menu. A customer can:
*	Book an appointment for a Car, Truck, or Motorcycle
*	Receive a unique booking reference number (e.g. FSB-002)
*	Check or cancel an existing booking by reference number
*	View all bookings in the system
It reqires JDK 8 or higher

Project Structure
Fuel_Station/ = Main.java           
Entry point and menu logic = Booking.java        
Booking entity (number, vehicle, date, time, status) = Vehicle.java        
Base class for all vehicles = Car.java           
Car subclass (adds fuelType) = Truck.java         
Truck subclass (adds isTrailer flag) = Motorcycle.java    
Motorcycle subclass (similar structure to Car)

OOP Concepts 
V1.0 :- Classes and Objects
A class is a blueprint of a object
Vehicle.java — entire file	Defines the Vehicle class with fields ownerName, PlateNumber, vehicleType
Booking.java — entire file	Defines the Booking class with fields bookingNumber, vehicle, date, time, status
Main.java line 66	Vehicle vehicle = new Car(name, plate, fuel); — creates a Car object at runtime
Main.java line 94	Vehicle vehicle = new Truck(name, plate, isTrailer); — creates a Truck object at runtime
Main.java line 46	Booking bkk = new Booking(number, vehicle, date, time); — creates a Booking object

V2.0 :- Encapsulation
Fields are kept private; access is controlled through public getters and setters, protecting internal state.

Vehicle.java lines 4–6	Fields ownerName, PlateNumber, vehicleType declared private
Vehicle.java lines 14–28	Public getters: getOwnerName(), getPlatenumber(), getVehicleType()
Vehicle.java lines 30–41	Public setters with validation: setOwnerName() and setPlatenumber() reject null/empty input
Booking.java lines 3–7	All fields (bookingNumber, vehicle, date, time, status) declared private
Booking.java — setStatus()	Validates that status can only be "Confirmed" or "Cancelled"; rejects any other value

V3.0 :- Inheritance
 A subclass (extends) inherits fields and methods from a parent class, and can add its own specific behaviour.

Car.java line 3	public class Car extends Vehicle — Car inherits from Vehicle
Truck.java line 3	public class Truck extends Vehicle — Truck inherits from Vehicle
Motorcycle.java line 3	public class Motorcycle extends Vehicle — Motorcycle inherits from Vehicle
Car.java line 5	super(ownerName, PlateNumber, vehicleType) — calls the Vehicle constructor to initialise shared fields
Truck.java line 5	super(ownerName, PlateNumber, vehicleType) — same pattern for Truck
Car.java line 7	Adds fuelType as a Car-specific field not present in Vehicle
Truck.java line 4	Adds isTrailer as a Truck-specific field not present in Vehicle

V4.0 :- Polymorphism
The same method call and behaves differently depending on the actual object type at runtime (method overriding). The reference type is Vehicle, but the executed method belongs to the actual subclass.

Vehicle.java — getInfo()	Base version returns: `"Vehicle
Car.java — @Override getInfo()	Overrides to return car-specific info including fuelType
Truck.java — @Override getInfo()	Overrides to return truck-specific info including isTrailer
Motorcycle.java — @Override getInfo()	Overrides to return motorcycle-specific info (similar to Car)
Booking.java — printDetails()	Calls vehicle.getInfo() on a Vehicle reference — at runtime Java calls the correct subclass version (Car/Truck/Motorcycle) automatically
Main.java — viewAll()	Iterates bookings list; each a.printDetails() triggers the right getInfo() for that vehicle type
The comment in Main.java inside viewAll() explicitly notes this: // vehicle.getInfo() inside printDetails() calls Car or Truck's version at runtime — this is runtime polymorphism (V4.0)

   N.B:
*	Default booking time for Cars is 08:30 and for Trucks is 09:00 if the user presses Enter without typing a time.
*	Booking numbers are generated sequentially in the format FSB-XXX.
*	The Motorcycle class follows the same pattern as Car (extends Vehicle, adds a fuel-type field, overrides getInfo()).

