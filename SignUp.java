package UserAccounts;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		StudentSignUp();
	}
	
	public static void StudentSignUp() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your First name: ");
		String firstname = input.nextLine();
		
		System.out.println("Enter your Surname: ");
		String surname = input.nextLine();
		
		System.out.println("Enter your email: ");
		String email = input.nextLine();	
		
		System.out.println("Enter your user name: ");
		String username = input.nextLine();
		
		System.out.println("Enter your prefered password: ");
		String password = input.nextLine();
		
		System.out.println("Enter your course: ");
		String course = input.nextLine();
		
		System.out.println("Enter your year: ");
		int year = input.nextInt();
		
		System.out.println("Enter your semester: ");
		int semester = input.nextInt();
		
		Student Student1 = new Student(firstname, surname, email, username, password, course, year, semester);
		Student1.toString();
		input.close();

		databaseConnect.Adduser(firstname,surname,email,username,password);
		
	}
	
//	public static void UserSignup() {
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Enter your First name: ");
//		String firstname = input.nextLine();
//		
//		System.out.println("Enter your Surname: ");
//		String surname = input.nextLine();
//		
//		System.out.println("Enter your email: ");
//		String email = input.nextLine();	
//		
//		System.out.println("Enter your user name: ");
//		String username = input.nextLine();
//		
//		System.out.println("Enter your prefered password: ");
//		String password = input.nextLine();
//		input.close();
//		
//		User User1 = new User(firstname, surname, email, username, password);
//		DatabasePersisters();
//		
//	}
	

}
