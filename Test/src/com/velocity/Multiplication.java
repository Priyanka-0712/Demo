package com.velocity;

import java.util.Scanner;

public class Multiplication {
	 public static void getmultiplication(int a,int b) {
		 int multiplication=a*b;
		 System.out.println("multiplication is>>"+multiplication);
		 }
	 
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNumber=sc.nextInt();
		System.out.println("Enter the second number");
		int secondNumber=sc.nextInt();
		getmultiplication(firstNumber, secondNumber);
		}
}
