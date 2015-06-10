import java.sql.*;

public class CreateDBExample {
// Database URL
	static final String DB_URL = "jdbc:mysql://localhost/";
	// Database credentials
	static final String USER = "root";
	static final String PASS = "mySQLpass";

	public static void main(String[] args) {
	
try (Connection con = Drivermanager.getConnection(DB_URL,USER, PASS);
		Statement stmt=con.createStatement();){
			
		System.outprintln("Database connection: Successful");
		
}catch(Exception e){
	
		System.outprintln("Database connection: Failed");
		
		e.printStackTrace();
}
}// end JDBCExample
