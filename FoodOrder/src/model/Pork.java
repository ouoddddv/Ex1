package model;

public class Pork {
	private int qty;
	private int price = 100;
	
	public void add() {
		qty++;
	}
	
	public void minus() {
		if(qty>0)qty--;
	}
	
	public int getTotal() {
		return qty * price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
}
