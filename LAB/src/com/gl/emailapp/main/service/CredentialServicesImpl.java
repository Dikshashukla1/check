package com.gl.emailapp.main.service;

import com.gl.emailapp.main.model.Employee;
import java.util.Random;

public class CredentialServicesImpl implements CredentialService {

	@Override
	public String passwordGenerator() {
		// TODO Auto-generated method stub
		String capChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallChars = "abcdefghijklmnopqrstvuwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^+=-&*()_<>?|/";
		String values = capChars + smallChars + numbers + symbols;
		
		Random random = new Random();
		char[] password = new char[8];
		for (int i = 0; i < 8; i++) {
			int randomNumber = random.nextInt(values.length());
			password[i] = values.charAt(randomNumber);
			
		}
		return new String(password) ;
	}

	@Override
	public String emailGenerator(Employee employee, String department) {
		// TODO Auto-generated method stub
		return (employee.getFirstname() + employee.getLastname()).toLowerCase() + "@" + department + ".abc.com";
	}

	@Override
	public void displayCredentials(Employee emp, String department) {
		// TODO Auto-generated method stub
		System.out.println(
				"Dear " + emp.getFirstname()+ "  "+ emp.getLastname()+ " your generated credentials are as follows:");
		System.out.println("Email : --> " + emailGenerator(emp, department));
		System.out.println("Password : --> " + passwordGenerator());
		
			}

}
