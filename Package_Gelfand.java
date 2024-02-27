public class Package_Gelfand {
    private int weight;
    private String destinationArea;
    private String destinationAddress;
    private String status;

    public Package_Gelfand(int weight, String destinationArea, String destinationAddress) {
        this.weight = weight;
        this.destinationArea = destinationArea;
        this.destinationAddress = destinationAddress;
        this.status = "In Warehouse";
    }


    public int getWeight() {
        return weight;
    }

    public String getDestinationArea() {
        return destinationArea;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

