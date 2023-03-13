package ustbatchnumber3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try
    	{  
    		Class.forName("com.mysql.jdbc.Driver");  
    		Connection con=DriverManager.getConnection(  
    		"jdbc:mysql://localhost:3306/prize","root","pass@word1");  
    		//here sonoo is database name, root is username and password  
    		java.sql.Statement stmt=(java.sql.Statement) con.createStatement();  
    		ResultSet rs=((java.sql.Statement) stmt).executeQuery("select * from pdetails");  
    		while(rs.next())  
    		System.out.println(rs.getString(1) +"  "+rs.getInt(2) +"  "+rs.getInt(3) );  
    		con.close();  
    	}
    	catch(Exception e)
    	{ 
    		System.out.println(e);
    	}  
    }  
}

