package DataAccessObjects.CustomerOrderDAO;

import java.util.ArrayList;

import Utility.DummyData;
import Entities.CustomerOrder;
import Entities.Product;

public class CustomerOrderDummyDAO implements CustomerOrderDAO {

	public ArrayList<CustomerOrder> getAllCustomerOrders() {
		
		System.out.println("Showing data from the dummy class...");
		System.out.println("------------------");
		
		ArrayList<CustomerOrder> allCustomerOrders = DummyData.getInstance().getAllCustomerOrders();
		
		return allCustomerOrders;
	}
	
	public CustomerOrder getCustomerOrderById(int id) {
		
		CustomerOrder customerOrder = DummyData.getInstance().getCustomerOrderById(id);
		
		return customerOrder;
	}
	
	public ArrayList<CustomerOrder> getCustomerOrdersByProduct(Product product) {
		
		ArrayList<CustomerOrder> customerOrdersByProduct = new ArrayList<CustomerOrder>();
		
		return customerOrdersByProduct;
	}
}
