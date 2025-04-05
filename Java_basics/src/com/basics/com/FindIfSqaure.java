package com.basics.com;

import java.util.*;

/**
 * The {@code FindIfSqaure} class provides functionality to check if the given length
 * and breadth form a sqaure or a rectangle
 * 
 * <p>This code takes input from the user, validate and generate the output. 
 * </p>
 * 
 * <p>Input 7,7</p>
 * <p>Output square </p>
 * 
 * @author Sakthisowmya Thiyagarajan TechMahindra
 * @since 05-04-2025
 * @version 1.0
 * 
 */
public class FindIfSqaure{
	
	/**
	 * The main method find if the given length and breadth forms a 
	 * square or the rectangle
	 * 
	 * @param args (not used since input is not through command line
	 */
	public static void main(String args[]) {
		//try with resource
		try(Scanner scan = new Scanner(System.in)){
			// prompt the length
			System.out.print("Enter the length : ");
			int length = checkIfInt(scan);
			
			// prompt the breadth
			System.out.print("Enter the breadth : ");
			int breadth = checkIfInt(scan);
			
			findIfSquare(length,breadth);
			
		}
	}
	
	/**
	 * This method finds the given dimension is a sqaure or rectangle
	 * by checking if the length and breadth are equal
	 * 
	 * @param length  prompts the input length from the user
	 * @param breadth prompts the input breadth from the user
	 */
	private static void findIfSquare(int length, int breadth) {
		if(length == breadth) {
			System.out.println("The given dimension is a square");
		}else {
			System.out.println("The given dimension is a rectangle");
		}
	}
	
   /**
    * This method scans the input until a proper positive number is entered by the user
    * 
    * @param scan Scanner object to validate user input
    * @return A valid positive integer given by the user
    */
	private static int checkIfInt(Scanner scan) {
		int value;
		while(true) {
			if(scan.hasNextInt()) {
				value= scan.nextInt();
				if(value>0) break;
			}
			else {
				scan.next();
			}
			System.out.println("The input is invalid. Try a positive value");
		}
		return value;
	}
	
	
}