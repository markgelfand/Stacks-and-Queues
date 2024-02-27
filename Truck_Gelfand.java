import java.util.Stack;

public class Truck_Gelfand {
    private int maxWeight;
    private int maxCapacity;
    private String servingArea;
    private String location;
    private Stack<Package_Gelfand> packages;

    public Truck_Gelfand(int maxWeight, int maxCapacity, String servingArea, String location) {
        this.maxWeight = maxWeight;
        this.maxCapacity = maxCapacity;
        this.servingArea = servingArea;
        this.location = location;
        this.packages = new Stack<>();
    }

    public int getNumPackages() {
        return packages.size();
    }

    public int getTotalWeight() {
        int totalWeight = 0;
        for (Package_Gelfand p : packages) {
            totalWeight += p.getWeight();
        }
        return totalWeight;
    }

    public String getNextLocation() {
        if(!packages.isEmpty())
        return packages.peek().getDestinationAddress();
        else {
            return "The next location is the warehouse";
        }
    }

    public void loadPackage(Package_Gelfand pkg) {
        packages.push(pkg);
    }

    public void unloadPackage() {
        if (!packages.isEmpty()) {
            Package_Gelfand pkg = packages.pop();
            pkg.setStatus("Delivered");
        }
    }

    public boolean isFull() {
        return packages.size() >= maxCapacity || getTotalWeight() >= maxWeight;
    }

    public boolean isEmpty() {
        return packages.isEmpty();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getServingArea() {
        return servingArea;
    }
}
