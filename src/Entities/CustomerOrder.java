package Entities;
import java.util.ArrayList;


public class CustomerOrder {

	private int id;
	private ArrayList<OrderLine> productsInOrder;
	
	public CustomerOrder() {
		id = 0;
		productsInOrder = new ArrayList<OrderLine>();
	}
	
	public CustomerOrder(int id, ArrayList<OrderLine> productsInOrder) {
		this.id = id;
		this.productsInOrder = productsInOrder;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<OrderLine> getProductsInOrder() {
		return productsInOrder;
	}

	public void setProductsInOrder(ArrayList<OrderLine> productsInOrder) {
		this.productsInOrder = productsInOrder;
	}
	
	
}
