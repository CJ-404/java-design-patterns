package prototype;
import java.util.ArrayList;
import java.util.List;

public class VehicleShop {
    private final List<Vehicle> vehicleList;

    public VehicleShop()
    {
        this.vehicleList = new ArrayList<>();
    }

    public VehicleShop(List<Vehicle> vehicleList)
    {
        this.vehicleList = vehicleList;
    }

    public VehicleShop clone() throws CloneNotSupportedException {
//        TODO: how to instantiate super.clone() here?
//        VehicleShop vehicleShop = (VehicleShop) super.clone();
        List<Vehicle> tempList = new ArrayList<>(this.getVehicleList());
        return new VehicleShop(tempList);
    }

    public VehicleShop addVehicle(Vehicle vehicle)
    {
        this.vehicleList.add(vehicle);
        return this;
    }

    public void removeVehicle(Vehicle vehicle)
    {
        this.vehicleList.remove(vehicle);
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }
}
