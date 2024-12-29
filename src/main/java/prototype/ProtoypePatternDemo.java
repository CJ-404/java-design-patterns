package prototype;

import common.PatternDemo;

public class ProtoypePatternDemo implements PatternDemo {
    @Override
    public void run() {
        VehicleShop shop1 = new VehicleShop();
        shop1
            .addVehicle(new Vehicle(1,"Audi A6"))
            .addVehicle(new Vehicle(2,"Honda Civic"))
            .addVehicle(new Vehicle(3,"Mitsubishi Montero"));

        System.out.println(shop1.getVehicleList());

        // instead of creating new object, clone existing object
        try {
            VehicleShop shop2 = shop1.clone();
            System.out.println(shop2.getVehicleList());
            shop2.addVehicle(new Vehicle(4,"Suzuki Swift"));
            System.out.println(shop2.getVehicleList());
            shop2.removeVehicle(new Vehicle(2,"Honda Civic"));
            System.out.println(shop2.getVehicleList());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
