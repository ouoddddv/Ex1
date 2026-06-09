package model;

public class OrderItem {

    private String name;
    private int price;
    private int qty;

    public OrderItem(String name, int price) {
        this.name = name;
        this.price = price;
        this.qty = 0;
    }

    public void add() {
        qty++;
    }

    public void minus() {
        if (qty > 0) qty--;
    }

    public int getQty() {
        return qty;
    }

    public int getTotal() {
        return qty * price;
    }

    public String getName() {
        return name;
    }
}