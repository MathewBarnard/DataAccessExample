package DataAccessObjects.OrderLineDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Utility.MySQLDatabase;
import Entities.OrderLine;

public class OrderLineDatabaseDAO implements OrderLineDAO {

	public ArrayList<OrderLine> findOrderLinesByOrderId(int id) {
		ArrayList<OrderLine> listOfOrderLines = new ArrayList<OrderLine>();
		
		Connection conn = MySQLDatabase.getConnection();
		
		try {
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM order_lines WHERE customerOrderId = " + String.valueOf(id);
			ResultSet resultSet = stmt.executeQuery(sql);
			
			while(resultSet.next()) {
				OrderLine orderLine = new OrderLine(resultSet.getInt("customerOrderId"),
													resultSet.getInt("productId"),
													resultSet.getInt("quantity"));
				
				listOfOrderLines.add(orderLine);
			}
			
			resultSet.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		MySQLDatabase.closeConnection(conn);
		
		return listOfOrderLines;
	}
}
