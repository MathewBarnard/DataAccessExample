package main;

import java.util.ArrayList;
import java.util.Scanner;

import DataAccessObjects.CustomerOrderDAO.CustomerOrderDAO;
import DataAccessObjects.CustomerOrderDAO.CustomerOrderDatabaseDAO;
import DataAccessObjects.CustomerOrderDAO.CustomerOrderDummyDAO;
import Entities.CustomerOrder;

public class Application {
	
	CustomerOrderDAO customerOrderDAO;
	
	Scanner scanner;
	
	public Application() {

		scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Would you like to access data from the database, or from the dummy class?");
			System.out.println("Type 'Database' or 'Dummy'");
			
			getChoice();
			
			CustomerOrder customerOrder = getId();
			
			printOrder(customerOrder);
		}
	}
	
	private void getChoice() {
		
		System.out.println("-------------------");
		System.out.println("Which order would you like to view?");
		
		String choice = scanner.next();
		
		switch(choice) {
		
		case "Database":
			customerOrderDAO = new CustomerOrderDatabaseDAO();
			break;
		case "Dummy":
			customerOrderDAO = new CustomerOrderDummyDAO();
			break;
		default:
			getChoice();
			break;
		}
	}
	
	private CustomerOrder getId() {
		
		System.out.println("-------------------");
		System.out.println("Please type the ID of the order you would like to view");
		
		int id = scanner.nextInt();
		
		CustomerOrder customerOrder = customerOrderDAO.getCustomerOrderById(id);
		
		return customerOrder;
	}
	
	private void printOrder(CustomerOrder order) {
		
		System.out.println("-------------------");
		System.out.println("Order ID: " + order.getId());
		System.out.println("-------------------");
		
		for(int i = 0; i < order.getProductsInOrder().size(); i++) {
			System.out.println("Product ID: " + order.getProductsInOrder().get(i).getProductId()
								+ " | x" + order.getProductsInOrder().get(i).getQuantity());
		}
		
		System.out.println("-------------------");
	}
}
