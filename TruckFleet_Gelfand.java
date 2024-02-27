
    import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedTransferQueue;

    public class TruckFleet_Gelfand {
        private ArrayList<Truck_Gelfand> trucks;
        private LinkedTransferQueue<Package_Gelfand> warehousePackages;

        public TruckFleet_Gelfand() {
            this.trucks = new ArrayList<>();
            this.warehousePackages = new LinkedTransferQueue<>();
        }

        public void addTruck(Truck_Gelfand truck) {
            trucks.add(truck);
        }

        public void addPackage(Package_Gelfand pkg) {
            if (pkg != null) {
                warehousePackages.offer(pkg);
                loadTrucks();
            }
        }

        private void loadTrucks() {
            for (Truck_Gelfand truck : trucks) {
                if (!warehousePackages.isEmpty()) {
                    Package_Gelfand pkg = warehousePackages.poll();
                    truck.loadPackage(pkg);
                }
            }
        }


        public String searchPackage(Package_Gelfand pkg) {
            return pkg.getDestinationArea();
        }

        public String searchTruck(Truck_Gelfand truck) {
           return truck.getLocation();
        }

        public void markPackageDelivered(Package_Gelfand pkg) {
            pkg.setStatus("Delivered");
        }

        public void returnTruckToWarehouse(Truck_Gelfand truck) {
            truck.setLocation("Warehouse");
        }

        public Integer test() {

            return null;
        }

        public ArrayList<Truck_Gelfand> getTrucks() {
            return trucks;
        }

        public LinkedTransferQueue<Package_Gelfand> getWarehousePackages() {
            return warehousePackages;
        }
    }

