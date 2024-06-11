package com.prowings.basics.forloop;

import java.util.Scanner;

// compute the sum of first 5 positive numbers

public class ForLoopWithContinue2 {

	public static void main(String[] args) {

		double number, sum = 0;

		// create scanner object
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i < 6; i++) {
			System.out.println("please enter the number :");

			number = sc.nextDouble();

			if (number <= 0.0) {
				continue;
			}
			sum += number; // sum=sum+number

			System.out.println("The Sum is :" + sum);

		}

	}

}
