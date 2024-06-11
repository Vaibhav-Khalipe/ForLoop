package com.prowings.basics.forloop;

import java.util.Arrays;

public class MergeTwoArraysUsingForLoop {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] b = { 11, 12, 13, 14, 15, 16 };
		
		int[]c=new int[a.length+b.length];
		
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			
		}
		
		
		for(int i=0;i<b.length;i++)
		{
			c[i+a.length]=b[i];
			
			
		}
		
		System.out.println("the merged array is:"+Arrays.toString(c));
		}
		
}