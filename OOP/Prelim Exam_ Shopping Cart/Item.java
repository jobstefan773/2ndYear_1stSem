public class Item{

    private String item_name;
    private int quantity;
    private double price;

    public Item(String item_name, int quantity, double price) {
        this.item_name = item_name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
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

    public double total () {
        return quantity * price;
    }
    
    public void Display () {
        System.out.printf("%-15s  %-2s  %-5s  %-5s\n", item_name, quantity, String.format("%.2f", price), String.format("%.2f", total()));
    }

    
}