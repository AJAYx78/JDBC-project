package CRUD.opertion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/ajaydb";
		String username="root";
		String password="root";
		
		String sql="INSERT INTO producct VALUES(10,'smartphone','Moto')";
		 
		 Connection connection=null;
		try {
			//load / register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//to establish the connection
		 connection=DriverManager.getConnection(url, username, password);
			
			//CREATE STATEMENTS
			Statement statement= connection.createStatement();
			
			//EXECUTE ALL STATEMENTS
			statement.execute(sql);
			System.out.println("All good");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		

	}


