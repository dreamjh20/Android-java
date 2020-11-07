package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbManager {

	public static Connection con;
	
	public DbManager() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company?serverTimezone=UTC", "root", "1234");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public ResultSet executeQuery(String sql, Object...objects) throws SQLException {
		PreparedStatement ps = con.prepareStatement(sql);
		
		for (int i = 0; i < objects.length; i++) {
			ps.setObject(i + 1, objects[i]);
		}
		
		return ps.executeQuery();
	}
	
	public void executeUpdate(String sql, Object...objects) throws SQLException {
		PreparedStatement ps = con.prepareStatement(sql);
		for (int i = 0; i < objects.length; i++) {
			ps.setObject(i+1, objects[i]);
		}
		ps.executeUpdate();
	}
}
