package CRUD.opertion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		
		try { // load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create a connection 
			String url="jdbc:mysql://localhost:3306/ajaydb1";
			String username="root";
			String password="root";
			
			Connection con =DriverManager.getConnection(url, username, password);
			
			// create a query
			 String sql="create table table1 (tid int(20) primary key auto_increment , tname varchar(200) not null , tcity varchar (400))";
			 
			 // create a Statement
			Statement stmt=con.createStatement();
			stmt.executeUpdate(sql);
			
			
			
			con.close();
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
