package UserAccounts;


public class User implements userActions{
	private String FirstName, Surname, email;
	private String userName;
	protected String password;
	
	public User(String FirstName,String Surname, String email,String userName,String password) {
		this.setFirstName(FirstName);
		this.setSurname(Surname);
		this.setEmail(email);
		this.setUserName(userName);
		this.setPassword(password);
	}

	public String getPassword() {
		return password;
	}
	
	
	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getSurname() {
		return Surname;
	}


	public void setSurname(String surname) {
		Surname = surname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
