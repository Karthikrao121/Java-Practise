package com.google.basic;

import java.util.Scanner;

public class ProgramRun {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int num = scanner.nextInt();
		System.out.println("the sum of multiples of 3 and 5 is:" + MultiplesOf3And5.SumOfMultiplesOf3And5(num));

	}
}
