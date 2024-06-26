package ConnectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	public static Connection con = null;
	private static ConnectDB instance = new ConnectDB();
	
	public static ConnectDB getInstance() {
		return instance;
	}
	
	public void connect() throws SQLException {
		con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLCP;user=sa;password=sapassword");
	}
	
	public void disconect() {
		if (con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static Connection getConnection() {
		return con;
	}
}
