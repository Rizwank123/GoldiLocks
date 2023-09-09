package com.masai;

import java.util.Scanner;

public class DecimalToBinary {
	
	// Function to convert a decimal string to a binary string
	private static String decimalToBinaryConvert(String decimalStr) {
		try {
			// Parse the input decimal string to an integer
			int decimalValue = Integer.parseInt(decimalStr);
			
			// Check if the input is non-negative
			if (decimalValue < 0) {
				throw new IllegalArgumentException("Input must be a non-negative decimal number");
			}
			
			// Convert the decimal value to binary using Integer.toBinaryString()
			String binaryString = Integer.toBinaryString(decimalValue);
			return binaryString;
		} catch (NumberFormatException ex) {
			// Handle the case where the input string is not a valid decimal number
			throw new IllegalArgumentException("Invalid Decimal Number: " + decimalStr);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the decimal string:");
		String decimal = sc.next();
		
		// Call the conversion function and display the results
		System.out.println("Decimal String is: " + decimal);
		System.out.println("Binary String is: " + decimalToBinaryConvert(decimal));
		
		// Close the scanner to prevent resource leaks
		sc.close();
	}
}
