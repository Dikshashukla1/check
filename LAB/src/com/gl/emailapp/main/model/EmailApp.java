package com.gl.emailapp.main.model;

import com.gl.emailapp.main.service.CredentialService;
import com.gl.emailapp.main.service.CredentialServicesImpl;

import java.util.Scanner;


public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CredentialService service = new CredentialServicesImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name");
		String firstName = sc.next();
		System.out.println("Enter the last name");
		String lastName = sc.next();
		Employee employee = new Employee(firstName,lastName);
		String dept = null;
		service.passwordGenerator();
		System.out.println("Please Enter the Department from the following");
		System.out.println("1. Press 1 for technial");
		System.out.println("2. Press 2 for Admin");
		System.out.println("3. Press 3 for Human Resource");
		System.out.println("4. Press 4 for legal");
		System.out.println("-------------------------------------");
		System.out.println("Enter your Choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:	
			dept = "tech";
			break;
			
		case 2:
			dept = "admin";
			break;
			
		case 3:
			dept ="HR";
			break;
			
		case 4:
			dept ="Legal";
			break;
			
		default :
			System.out.println("Enter the correct Choice");
			
		
		}
		service.emailGenerator(employee, dept);
		service.displayCredentials(employee, dept);
	}

}
