package Utility;

import java.util.ArrayList;

import Entities.CustomerOrder;
import Entities.OrderLine;

public class DummyData {

	private static DummyData instance = null;
	
	ArrayList<CustomerOrder> listOfCustomerOrders;
	
	public static DummyData getInstance() {
		
		if(instance == null) {
			instance = new DummyData();
		}
		
		return instance;
	}
	
	public DummyData() {
		
		listOfCustomerOrders = new ArrayList<CustomerOrder>();
		
		ArrayList<OrderLine> orderLines1 = new ArrayList<OrderLine>();
		orderLines1.add(new OrderLine(1, 1, 23));
		orderLines1.add(new OrderLine(1, 2, 21));
		orderLines1.add(new OrderLine(1, 3, 45));
		listOfCustomerOrders.add(new CustomerOrder(1, orderLines1));
		
		ArrayList<OrderLine> orderLines2 = new ArrayList<OrderLine>();
		orderLines2.add(new OrderLine(2, 5, 10));
		orderLines2.add(new OrderLine(2, 8, 15));
		listOfCustomerOrders.add(new CustomerOrder(2, orderLines2));
		
		ArrayList<OrderLine> orderLines3 = new ArrayList<OrderLine>();
		orderLines3.add(new OrderLine(3, 2, 64));
		orderLines3.add(new OrderLine(3, 4, 30));
		listOfCustomerOrders.add(new CustomerOrder(3, orderLines3));
	}
	
	
	
	public ArrayList<CustomerOrder> getAllCustomerOrders() {
					
		return listOfCustomerOrders;
	}
	
	public CustomerOrder getCustomerOrderById(int id) {
		
		for(int i = 0; i < listOfCustomerOrders.size(); i++) {
			
			if(listOfCustomerOrders.get(i).getId() == id) {
				
				return listOfCustomerOrders.get(i);
			}
		}
		
		return null;
	}
}