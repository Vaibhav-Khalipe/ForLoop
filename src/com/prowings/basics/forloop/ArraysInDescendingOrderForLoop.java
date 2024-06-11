package com.prowings.basics.forloop;

import java.util.Arrays;
 
//if we change the condition nums[i]> nums[j] and return[nums.length-2] then it is ascending order

public class ArraysInDescendingOrderForLoop {
	
	public static void main(String[] args) {
		
		
		int[]nums= {10,8,20,12,5};
		System.out.println("the arrays before sorting are"+Arrays.toString(nums));
		int secondHighestNumber =findSecondHighestNumber(nums);
		System.out.println("the second highest number is :"+secondHighestNumber);
		
	}

	public static int findSecondHighestNumber(int[] nums) {
		
		int temp=0;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] < nums[j]) {

					temp = nums[i];
					nums[i] = nums[j];
						nums[j] = temp;
					
				}
			}
		}
		System.out.println("the arrays after sorting are"+Arrays.toString(nums));
		return nums[nums.length-5];
	}

}
