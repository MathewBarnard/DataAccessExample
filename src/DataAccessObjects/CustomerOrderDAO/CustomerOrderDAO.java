package DataAccessObjects.CustomerOrderDAO;
import java.util.ArrayList;

import Entities.CustomerOrder;
import Entities.Product;


public interface CustomerOrderDAO{
	
	public ArrayList<CustomerOrder> getAllCustomerOrders();
	public CustomerOrder getCustomerOrderById(int id);
	public ArrayList<CustomerOrder> getCustomerOrdersByProduct(Product product);
}
