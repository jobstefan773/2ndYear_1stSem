public class Software {
    private String softName;
    private double version;
    private int quantity;
    private double price;

    
    public Software(String softName, double version, int quantity, double price) {
        this.softName = softName;
        this.version = version;
        this.quantity = quantity;
        this.price = price;
    }

    public String getSoftName() {
        return softName;
    }


    public void setSoftName(String softName) {
        this.softName = softName;
    }


    public double getVersion() {
        return version;
    }


    public void setVersion(double version) {
        this.version = version;
    }


    public int getQuantity() {
        return quantity;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    } 

    
}
