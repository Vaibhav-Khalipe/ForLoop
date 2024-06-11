package com.prowings.basics.forloop;

import java.util.Scanner;

public class ForLoopArrayGradeCalculator {
	
	public static String gradeCalculator(int[] marks)
	{
		int avg =0;
		int sum=0;
		
		for(int n:marks)
		{
			sum+=n;           //sum =sum+n
			avg=sum/marks.length;
		}
		return avg>0 && avg<=40 ? "c grade": avg>=41 && avg<=60 ? "b grade" :avg>=61 && avg<=100 ? "a grade" :"invalid grade";
	}
	
	public static void main(String[] args) {
		
		int [] marks= new int [5];
		// take input from scanner 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks of 5 subjects");
		
		for(int i=0;i<5;i++)
		{
			marks [i]= sc.nextInt();
			
		}
		String grade = gradeCalculator(marks);
		System.out.println("the grade is :"+grade);
		
	}
	
	

	
	
	
}
