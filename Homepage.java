package UserAccounts;

import java.util.Scanner;

public class Homepage {

	public static void main(String[] args) {
		databaseConnect.main(null);
		int typeOfUser;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the information system");
		System.out.println("If you want to signup,enter 1.\nIf you want to login, enter 2");
		
		int choice = input.nextInt();
		
		switch (choice) {
			case 1:
				System.out.println("-----------Sign up-----------");
				System.out.println("For students, choose option 1.\nFor lecturers choose option 2");
				
				typeOfUser = input.nextInt();
				
				if(typeOfUser == 1) {
					SignUp.StudentSignUp();
				} else if (typeOfUser == 2) {
					SignUp.main(null);
				}
				break;
			
			case 2:
				System.out.println("-----------Login-----------");
				System.out.println("For students, choose option 1.\nFor lecturers choose option 2");
				
				typeOfUser = input.nextInt();
				
				if(typeOfUser == 1) {
					Login.main(null);
				} else if (typeOfUser == 2) {
					Login.main(null);
				}
				break;
		}
		
		
		
		
		
		
		
		
		input.close();
	}

}
