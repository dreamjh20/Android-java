package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Setting {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?allowLoadLocalInfile=true&serverTimezone=UTC", "root", "1234");
		Statement stmt = con.createStatement();
		
		stmt.execute("DROP DATABASE IF EXISTS company");
		stmt.execute("CREATE DATABASE company");
		
//		stmt.executeQuery(sql); // select
//		stmt.executeUpdate(sql); // create, update, delete
		
		stmt.execute("USE company");
		stmt.execute("create table admin(\r\n"
				+ "	name varchar(20) not null,\r\n"
				+ "	passwd varchar(20) not null,\r\n"
				+ "	position varchar(20),\r\n"
				+ "	jumin char(14),\r\n"
				+ "	inputDate date,\r\n"
				+ "    primary key (name, passwd)\r\n"
				+ ")");
		
		stmt.execute("set global local_infile=true");
		stmt.execute("load data local infile './제공파일/admin.txt' into table admin ignore 1 lines");
		
		stmt.execute("drop user if exists 'user'");
		stmt.execute("create user 'user' identified by '1234'");
		stmt.execute("grant select, insert, delete, update on company.* to 'user'");
		stmt.execute("flush privileges");
	}
}
