public class TruckChallenge_Gelfand {
    public static void main(String[] args) {
        TruckFleet_Gelfand warehouse = new TruckFleet_Gelfand();


        Truck_Gelfand truck1 = new Truck_Gelfand(200, 15, "Freehold", "Warehouse");
        Truck_Gelfand truck2 = new Truck_Gelfand(100, 7, "Manalapan", "Warehouse");
        Truck_Gelfand truck3 = new Truck_Gelfand(75, 2, "Colts Neck", "Warehouse");
        Truck_Gelfand truck4 = new Truck_Gelfand(300, 25, "Howell", "Warehouse");
        Truck_Gelfand truck5 = new Truck_Gelfand(250, 21, "Marlboro", "Warehouse");

        warehouse.addTruck(truck1);
        warehouse.addTruck(truck2);
        warehouse.addTruck(truck3);
        warehouse.addTruck(truck4);
        warehouse.addTruck(truck5);

        Package_Gelfand package1 = new Package_Gelfand(20, "Manalapan", "101 Road St");
        Package_Gelfand package2 = new Package_Gelfand(100, "Manalapan", "300 Street Rd");
        Package_Gelfand package3 = new Package_Gelfand(150, "Freehold", "32 Avenue Rd");
        Package_Gelfand package4 = new Package_Gelfand(10, "Freehold", "1 Main St");
        Package_Gelfand package5 = new Package_Gelfand(15, "Freehold", "15 Temple Rd");
        Package_Gelfand package6 = new Package_Gelfand(16, "Freehold", "3 My Rd");
        Package_Gelfand package7 = new Package_Gelfand(1, "Marlboro", "4 Goldstein Way");
        Package_Gelfand package8 = new Package_Gelfand(15, "Marlboro", "15 Goldstein Way");
        Package_Gelfand package9 = new Package_Gelfand(35, "Freehold", "53 CompSci Ct");
        Package_Gelfand package10 = new Package_Gelfand(54, "Marlboro", "32 ColtsNeck Rd");

        warehouse.addPackage(package1);
        warehouse.addPackage(package2);
        warehouse.addPackage(package3);
        warehouse.addPackage(package4);
        warehouse.addPackage(package5);
        warehouse.addPackage(package6);
        warehouse.addPackage(package7);
        warehouse.addPackage(package8);
        warehouse.addPackage(package9);
        warehouse.addPackage(package10);

        warehouse.test();

        System.out.println("Truck1's next location: " + truck1.getNextLocation());
        System.out.println("Truck2's next location: " + truck2.getNextLocation());
        System.out.println("Truck3's next location: " + truck3.getNextLocation());
        System.out.println("Truck4's next location: " + truck4.getNextLocation());
        System.out.println("Truck5's next location: " + truck5.getNextLocation());


        while (!warehouse.getTrucks().isEmpty()) {
            for (Truck_Gelfand truck : warehouse.getTrucks()) {
                if (!truck.isEmpty()) {
                    truck.unloadPackage();
                } else {
                    warehouse.returnTruckToWarehouse(truck);
                }
            }
            warehouse.test();
        }


        for (Package_Gelfand pkg : warehouse.getWarehousePackages()) {
            System.out.println("Package at " + pkg.getDestinationAddress() + ": " + pkg.getStatus());
        }
    }
}
