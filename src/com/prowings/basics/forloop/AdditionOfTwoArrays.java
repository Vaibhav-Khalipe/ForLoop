package com.prowings.basics.forloop;

import java.util.Arrays;

public class AdditionOfTwoArrays {

	public static  void main(String[] args) {

		
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 1, 2, 3, 4, 5 };

		int[] c = new int[a.length];

		if (a.length == b.length) {
			for (int i = 0, j = 0, k = 0; i < a.length; i++, j++, k++) {
				c[k] = a[i] + b[i];

			}
		}
		System.out.println("addition of arrays are" + Arrays.toString(c));

	}

}
