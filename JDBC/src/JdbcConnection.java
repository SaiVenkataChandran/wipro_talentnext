import java.sql.*;
public class JdbcConnection {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@//LAPTOP-PCIS0HGG:1521/XE";
		String username = "system";
		String password = "SaiAdmin15";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection established succesfully.");
			con.close();
		}catch(Exception e) {
			System.out.println("Connection could not established");
			System.out.println("Exception: " + e.getMessage());
		}


	}

}
