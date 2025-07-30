package executingQuery_ProcessingResults;
import java.sql.*;
public class Question1 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@//LAPTOP-PCIS0HGG:1521/XE";
		String username = "system";
		String password = "SaiAdmin15";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url,username,password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from emp");
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString("ename");
				System.out.println("Emp No: " + id + " Emp Name: " + name);
			}
			rs.close();
			stmt.close();
			con.close();
		}catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

}
