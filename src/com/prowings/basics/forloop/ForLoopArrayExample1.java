package com.prowings.basics.forloop;

public class ForLoopArrayExample1 {

	public static void main(String[] args) {
		
		int [] numbers = new int[10];
		
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
		numbers[5]=60;
		numbers[6]=70;
		numbers[7]=80;
		numbers[8]=90;
		numbers[9]=100;
		
		System.out.println("numbers[] lenght"+numbers.length);
		
		                               //int i=-10;i<0;i++
		for(int i=0;i<10;i++)
		{
			System.out.println(numbers[i]);
		}
		
		for(int n:numbers)
		{
			System.out.println("n ="+n);
		}
		

	}

}
