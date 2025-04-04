package com.basics.com;

import java.util.*;

public class FindIfSquare {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length and breadth : ");
		int length = scan.nextInt();
		int breadth = scan.nextInt();
		
		if(length==breadth) {
			System.out.println("It is a square");
		}else {
			System.out.println("It is not a square. It is a rectangle");
		}
	}
}
