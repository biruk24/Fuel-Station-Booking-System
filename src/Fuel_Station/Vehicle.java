package Fuel_Station;

public class Vehicle {
    private String ownerName;
    private String PlateNumber;
    public String vehicleType;

    public Vehicle(String ownerName, String PlateNumber, String vehicleType) {
        this.ownerName = ownerName;
        this.PlateNumber = PlateNumber;
        this.vehicleType = vehicleType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getPlatenumber() {
        return PlateNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setOwnerName(String name) {
        if (name != null && !name.isEmpty()) {
            this.ownerName = name;
        } else {
            System.out.println("Error: Name cannot be empty.");
        }
    }

    public void setPlatenumber(String Plate) {
        if (Plate != null && !Plate.isEmpty()) {
            this.PlateNumber = Plate;
        } else {
            System.out.println("Error: Plate Number cannot be empty");
        }
    }
    public String getInfo(){
        return "Vehicle | Owner: " + ownerName + " | Plate: " + PlateNumber + "vehicletype:" + getVehicleType();
    }
}

