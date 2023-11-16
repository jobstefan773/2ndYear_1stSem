public class Invoice {

    private String partNum;
    private String partDesc;
    private int quantity;
    private double price;
    
    public Invoice() {
        this.partNum = "";
        this.partDesc = "";
        this.quantity = 0;
        this.price = 0.0;
    }

    public Invoice (String partNum, String partDesc, int quantity, double price) {
        this.partNum = partNum;
        this.partDesc = partDesc;
        this.quantity = quantity;
        this.price = price;
    }

    public String getPartNum() {
        return partNum;
    }

    public void setPartNum(String partNum) {
        this.partNum = partNum;
    }

    public String getPartDesc() {
        return partDesc;
    }

    public void setPartDesc(String partDesc) {
        this.partDesc = partDesc;
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

    public double getInvoice (int quantity, double price) {
        if (quantity < 0) {
            quantity = 0;
        }
        if (price < 0.0) {
            price = 0.0;
        }
        return quantity * price;
    }

}