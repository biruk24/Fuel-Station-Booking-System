package Fuel_Station;

public class Motorcycle extends Vehicle {

    public Motorcycle(String ownerName, String PlateNumber) {
        super(ownerName, PlateNumber, "MotorCycle");


    }

    @Override
    public String getInfo(){
        return "Motorcycle | Owner: " + getOwnerName() + " | Plate: " + getPlatenumber();

    }

}

