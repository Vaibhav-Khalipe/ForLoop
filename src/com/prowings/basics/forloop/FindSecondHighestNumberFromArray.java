package com.prowings.basics.forloop;

import java.util.Arrays;
 
// this is program of arrays in ascending order

public class FindSecondHighestNumberFromArray {

	public static void main(String[] args) {

		int[] nums = { 10, 8, 20, 12, 5 };

		System.out.println("the original arrays are :" + Arrays.toString(nums));
		int secondHighestNumber = findSecondHighestNumbers(nums);
		System.out.println("the second highest number is :" + secondHighestNumber);

	}

	public static int findSecondHighestNumbers(int[] nums) {

		int temp = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] > nums[j]) {

					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		System.out.println("the arrays after sorting are :" + Arrays.toString(nums));
		return nums[nums.length-2];
	}
}
