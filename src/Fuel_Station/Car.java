package Fuel_Station;

public class Car extends Vehicle {
    private String fuelType;

    public Car(String ownerName, String PlateNumber, String vehicleType, String fuelType) {
        super(ownerName, PlateNumber, vehicleType);
        this.fuelType = fuelType;

    }
    public String getfuelType() {
        return fuelType;
    }
    @Override
    public String getInfo(){
        return "Car | Owner: " + getOwnerName() + " | Plate: " + getPlatenumber() + " | Fuel: " + fuelType;

    }

}


