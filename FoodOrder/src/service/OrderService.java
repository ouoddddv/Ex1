package service;

import model.Order;
import model.OrderItem;

public class OrderService {

    private Order order = new Order();

    public void add(int index) {
        order.getItems().get(index).add();
    }

    public void minus(int index) {
        order.getItems().get(index).minus();
    }

    public int getQty(int index) {
        return order.getItems().get(index).getQty();
    }

    public int getTotal() {
        int sum = order.getRawTotal();

        if (sum >= 500) {
            sum *= 0.9;
        }

        return sum;
    }
    
    public void reset() {
        for (int i = 0; i < 3; i++) {
            while (getQty(i) > 0) {
                minus(i);
            }
        }
    }
}