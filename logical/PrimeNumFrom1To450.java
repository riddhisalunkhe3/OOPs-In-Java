package com.logical;

public class PrimeNumFrom1To450 {
	public static void main(String[] args) {
		for(int j = 1; j<=450;j++)
		  {
			  int num ;
			  num = j;
			  int count = 0;
		    for(int i = 1;i<=num;i++)
		    {
		    	
		    	if(num%i==0)
		    	{
		    		count++;
		    	}
		    	
		    }
		    if(count == 2)
		    {
		    	System.out.println(num);
		    }
	    } 
	}
}
