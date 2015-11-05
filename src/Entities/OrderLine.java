package Entities;

public class OrderLine {

	private int orderId;
	private int productId;
	private int quantity;
	
	public OrderLine() {
		orderId 	= 0;
		productId 	= 0;
	}
	
	public OrderLine(int orderId, int productId, int quantity) {
		this.orderId 	= orderId;
		this.productId 	= productId;
		this.quantity = quantity;
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
