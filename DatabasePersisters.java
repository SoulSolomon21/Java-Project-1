package UserAccounts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.sqlite.SQLiteDataSource;

//Crud persister which creates and maintains a database connection from when its constructed so you don't have to
//keep recreating a connection for every operation
public class DatabasePersisters{
	public Connection conn = null;
	
	public DatabasePersisters() throws SQLException{
		SQLiteDataSource ds = null;
		ds = new SQLiteDataSource(); 
		ds.setUrl("jdbc:sqlite:C:/Users/USER/OneDrive/Documents/Java Workspace/Learn Java/src/UserAccounts/user.db");
	}

public void CreateUser(User User) throws SQLException {
	PreparedStatement stmt = conn.prepareStatement("INSERT INTO Users(FIRSTNAME,SURNAME,EMAIL,USERNAME,PASSWORD) VALUES (?,?,?,?,?);",Statement.RETURN_GENERATED_KEYS);
	stmt.setString(2, User.getFirstName());
	stmt.setString(3, User.getSurname());
	stmt.setString(4, User.getEmail());
	stmt.setString(5, User.getUserName());
	stmt.setString(6, User.getPassword());	
	
	stmt.executeUpdate();
}







}
