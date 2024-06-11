package com.prowings.basics.forloop;


// program to find sum of natural numbers from 1 to 200

public class ForLoopExample2 {
	
	public static void main(String[] args) {
		
		int counter=0;
		
		for(int i=0;i<=200;i++)
		{
			
			//counter = counter +i
			
			counter+=i;
		}
		System.out.println("The sum is :"+counter);
	}
}
	
	
	
	
