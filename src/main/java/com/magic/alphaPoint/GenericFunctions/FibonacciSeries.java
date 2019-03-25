package com.magic.alphaPoint.GenericFunctions;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int i=0;
		int j=1;
		
		
		for(int l=0;l<10;l++)
		{
			System.out.println(i);
			int k=i+j;
			i=j;
			j=k;
			
			
		}
	}

}
