package Fuel_Station;

public class Car extends vehicle {
    private String fuelType;

    public car(String ownerName, String licensePlate, String fuelType) {
        super(ownerName, licensePlate, vehicleType: "Car");
        this.fuelType = fuelType;

    }
    public String getfuelType() {
        return fuelType;
    }
    @Override
    public String getInfo(){
        return "Car | Owner: " + getOwnerName() + " | Plate: " + getLicensePlate() + " | Fuel: " + fuelType;

    }
}
