package UserAccounts;

import org.sqlite.SQLiteDataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.UUID;

public class databaseConnect {
	public static void main(String[] args) {
	
	SQLiteDataSource ds = null;
	
	try {
		ds = new SQLiteDataSource(); 
		ds.setUrl("jdbc:sqlite:C:/Users/USER/OneDrive/Documents/Java Workspace/Learn Java/src/UserAccounts/user.db");
	} catch (Exception e) {
		
		e.printStackTrace();
		System.exit(0);
	}
	
	System.out.println("Created database successfully");
	
	
	try(Connection conn = ds.getConnection()){
		
	} catch (SQLException e) {
		e.printStackTrace();
		System.exit(0);
	}

	String query = "CREATE TABLE IF NOT EXISTS Users(" +
			"ID INTEGER PRIMARY KEY," +
			"FIRSTNAME TEXT NOT NULL," +
			"SURNAME TEXT NOT NULL," +
			"EMAIL TEXT NOT NULL," +
			"USERNAME TEXT NOT NULL,"+
			"PASSWORD TEXT NOT NULL)";
		
	try (Connection conn = ds.getConnection();
			Statement stmt = conn.createStatement();
			){
		stmt.executeUpdate(query);
				
	} catch(SQLException e) {
		e.printStackTrace();
		System.exit(0);	
	}
	
	System.out.println("Opened database successfully");
	}
	
	public static void Adduser(String FName,String SName,String email, String UName, String Pword) {
		SQLiteDataSource ds = null;
		
		try {
			ds = new SQLiteDataSource(); 
			ds.setUrl("jdbc:sqlite:C:/Users/USER/OneDrive/Documents/Java Workspace/Learn Java/src/UserAccounts/user.db");
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println("Opened database successfully");
		
		String query =  "INSERT INTO Users(FIRSTNAME,SURNAME,EMAIL,USERNAME,PASSWORD) VALUES ('" + FName + "','" + SName + "','" + email + "','" + UName + "','" + Pword + "');";

		try (Connection conn = ds.getConnection();
				Statement stmt = conn.createStatement();
				){
			int rv = stmt.executeUpdate(query);
			
			System.out.println("executeUpdate() returned " + rv);
			
		} catch(SQLException e) {
			e.printStackTrace();
			System.exit(0);	
		}
	}
	
	
	public static void queryAll() {
SQLiteDataSource ds = null;
		
		try {
			ds = new SQLiteDataSource(); 
			ds.setUrl("jdbc:sqlite:C:/Users/USER/OneDrive/Documents/Java Workspace/Learn Java/src/UserAccounts/user.db");
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println("Opened database successfully");
		
		String query =  "SELECT * FROM Users;";
		
		try (Connection conn = ds.getConnection();
				Statement stmt = conn.createStatement();
				){
			ResultSet rs = stmt.executeQuery(query);
			
			System.out.println("executeUpdate() returned " + rs);
			
			while (rs.next()) {
				String fname = rs.getString("FIRSTNAME");
				String sname = rs.getString("SURNAME");
				String email = rs.getString("EMAIL");
				String uname = rs.getString("USERNAME");
				
				System.out.printf("First Name: %s%nSurname: %s%nEmail: %s%nUsername: %s%n",fname,sname,email,uname);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
			System.exit(0);	
		}
	}

//	public static void Adduser(UUID id, String firstname, String surname, String email, String username,String password) {
//		// TODO Auto-generated method stub
//		
//	}
	
}
