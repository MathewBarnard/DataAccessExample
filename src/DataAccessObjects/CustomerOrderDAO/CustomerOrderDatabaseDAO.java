package DataAccessObjects.CustomerOrderDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import DataAccessObjects.OrderLineDAO.OrderLineDAO;
import DataAccessObjects.OrderLineDAO.OrderLineDatabaseDAO;
import Entities.CustomerOrder;
import Entities.OrderLine;
import Entities.Product;

public class CustomerOrderDatabaseDAO implements CustomerOrderDAO {

	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL 		= "jdbc:mysql://localhost/mydb";
	
	private static final String USER = "root";
	private static final String PASS = "netbuilder";
	
	public ArrayList<CustomerOrder> getAllCustomerOrders() {
		
		System.out.println("Showing data from the database...");
		System.out.println("------------------");
		
		ArrayList<CustomerOrder> allCustomerOrders = new ArrayList<CustomerOrder>();
		
		return allCustomerOrders;
	}
	
	public CustomerOrder getCustomerOrderById(int id) {
		
		OrderLineDAO orderLineDAO = new OrderLineDatabaseDAO();
		
		ArrayList<OrderLine> listOfOrderLines = orderLineDAO.findOrderLinesByOrderId(id);
		
		CustomerOrder customerOrder = new CustomerOrder(id, listOfOrderLines);
		
		return customerOrder;
	}
	public ArrayList<CustomerOrder> getCustomerOrdersByProduct(Product product) {
		
		ArrayList<CustomerOrder> customerOrdersByProduct = new ArrayList<CustomerOrder>();
		
		return customerOrdersByProduct;
	}
}
