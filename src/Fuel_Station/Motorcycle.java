package Fuel_Station;

public class Motorcycle extends Vehicle {
    private String fuelType;

    public Motorcycle(String ownerName, String PlateNumber, String vehicleType) {
        super(ownerName, PlateNumber, vehicleType);
        this.fuelType = fuelType;

    }
    public String getfuelType() {
        return fuelType;
    }
    @Override
    public String getInfo(){
        return "Motorcycle | Owner: " + getOwnerName() + " | Plate: " + getPlatenumber() + " | Fuel: " + fuelType;

    }

}

