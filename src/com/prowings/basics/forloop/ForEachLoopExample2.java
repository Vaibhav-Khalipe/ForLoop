package com.prowings.basics.forloop;

public class ForEachLoopExample2 {
	
	public static void main(String[] args) {
		
		String[]a= {"Audi","BMW","Mercedez","Volvo","Tata"};
		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		
		
		//Above Expression is equivalent to for each loop
		
		for(String x:a)
		{
			System.out.println(x);
		}
	}

}
