package com.gl.emailapp.test;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		String capChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallChars = "abcdefghijklmnopqrstvuwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^+_=-&*()_";
		String values = capChars + smallChars + numbers + symbols;
		
		Random random = new Random();
		System.out.println(values.length());
		System.out.println(random.nextInt(values.length()));
		System.out.println(random.nextInt(values.length()));
		System.out.println(random.nextInt(values.length()));
		System.out.println(random.nextInt(values.length()));
		System.out.println(random.nextInt(values.length()));
	

	}

}
