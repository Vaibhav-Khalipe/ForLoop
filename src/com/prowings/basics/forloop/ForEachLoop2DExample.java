package com.prowings.basics.forloop;

public class ForEachLoop2DExample {

	public static void main(String[] args) {

		int[][] x = { { 10, 20, 30 }, { 40, 50 } };

		for (int[] x1 : x) {
			for (int x2 : x1) {
				System.out.println(x2);

			}
		}
	}
}
