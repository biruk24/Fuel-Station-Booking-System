package Fuel_Station;

public class Truck extends Vehicle{
    boolean istrailer;
    public Truck(String ownerName, String PlateNumber, String vehicleType, boolean istrailer){
        super(ownerName, PlateNumber, vehicleType);
        this.istrailer = istrailer;
    }

    @Override
    public String getInfo() {
        return "Owner name:" + getOwnerName() + "| Plate:" + getPlatenumber() + "| Is trailer:" + getVehicleType();
    }

}
