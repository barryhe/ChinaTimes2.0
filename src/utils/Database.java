package utils;

import com.mysql.jdbc.Driver;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Database {
	private Connection connection;
	
	/* 
	 * In config.txt, 
	 * 		1st line: IP Address (default port 3306)
	 * 		2nd line: Username
	 * 		3rd line: Password
	 * 		4th line: Database name
	 */
	private static final String FILENAME = "src/utils/config.txt";
	private static String db_name; 
	
	public Database() {
		try {
			new Driver();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	 
	public void connect() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(FILENAME)); 
			String ip = br.readLine(); 
			String user = br.readLine();
			String password = br.readLine(); 
			db_name = br.readLine();
			connection = DriverManager.getConnection("jdbc:mysql://" + ip
																	 + "?user=" + user 
																	 + "&password=" + password
																	 + "&useSSL=false");
			
			System.out.println(ip + " " + user + " " + password + " " + db_name);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void stop() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*
	public static void main(String [] args) {
		Database db = new Database();
		db.connect();
		db.stop();
	}
	*/
}
