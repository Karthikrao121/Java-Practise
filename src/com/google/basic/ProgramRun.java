package com.google.basic;

import java.util.Scanner;

public class ProgramRun {

	public static void main(String[] args) {
		/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
		Find the sum of all the multiples of 3 or 5 below 1000.*/
		//uncomment to run sum of all the multiples of 3 or 5
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int num = scanner.nextInt();
		System.out.println("the sum of multiples of 3 and 5 is:" + MultiplesOf3And5.SumOfMultiplesOf3And5(num));*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int num = scanner.nextInt();
		System.out.println("the sum of even fib values:" + SumOfEvenValuedFibonacciNum.sumOfEvenFibNum(num));

	}
}
