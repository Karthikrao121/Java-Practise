package com.google.basic;

/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/
public class MultiplesOf3And5 {
	public static int sum = 0;

	public static int SumOfMultiplesOf3And5(int num) {
		for (int i = 1; i < num; i++) {
			if (i % 3 == 0 | i % 5 == 0) {
				sum = sum + i;
			}
		}

		return sum;

	}

}
