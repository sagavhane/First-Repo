package day29_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/excelrseptfsd2026", "root", "Sangram1@"
		);
		System.out.println(connection.isClosed());
		
		  String query = "create table emp2(\r\n"
	                + "eno int(5),\r\n"
	                + "ename varchar(15),\r\n"
	                + "salary numeric(5,2));";
		  
		  Statement st = connection.createStatement();
		  
		  
		  st.execute(query);
		  
		  
		  System.out.println("Table Created Successfully!!!");
		  
		
		connection.close();
		
		
		
	}

}
