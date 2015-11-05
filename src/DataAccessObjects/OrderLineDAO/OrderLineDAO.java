package DataAccessObjects.OrderLineDAO;

import java.util.ArrayList;

import Entities.OrderLine;

public interface OrderLineDAO {
	
	public ArrayList<OrderLine> findOrderLinesByOrderId(int id);
} 