package ustbatchnumber3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc {
	
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
    		Connection con=DriverManager.getConnection(  
    		"jdbc:mysql://localhost:3306/prize","root","pass@word1");
    		java.sql.Statement stmt=(java.sql.Statement) con.createStatement();  
    		          
          System.out.println("Inserting records into the table...");          
          String sql1 = "INSERT INTO Registration VALUES (100, 'Zara', 'Ali', 18)";
          stmt.executeUpdate(sql1);
          sql1 = "INSERT INTO Registration VALUES (101, 'Mahnaz', 'Fatma', 25)";
          stmt.executeUpdate(sql1);
          sql1 = "INSERT INTO Registration VALUES (102, 'Zaid', 'Khan', 30)";
          stmt.executeUpdate(sql1);
          sql1 = "INSERT INTO Registration VALUES(103, 'Sumit', 'Mittal', 28)";
          stmt.executeUpdate(sql1);
          System.out.println("Inserted records into the table...");  
		}
		catch (SQLException e) {
	         e.printStackTrace();
		}
	}
		
	
	
}
