package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private List<OrderItem> items = new ArrayList<>();
	
	public Order(){
		items.add(new OrderItem("雞腿飯", 120));
		items.add(new OrderItem("排骨飯", 100));
		items.add(new OrderItem("菜飯", 80));
	}
	
	public List<OrderItem> getItems(){
		return items;
	}
	
	public int getRawTotal() {
		int sum = 0;
		for(OrderItem item:items ) {
			sum += item.getTotal();
		}
		
		return sum;
	}
}
	

