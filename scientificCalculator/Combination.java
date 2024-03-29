package scientificCalculator;

import java.util.Scanner;
public class Combination
{   
		// Finds Factorial
    public static int fact (int num) {    
       		  if (num == 1)
			return 1;
		  else	
			return fact(num-1) * num;
   	    }

		// Function to find NCR by accepting n and r
    public static int ncr(int n,int r)  {
   		  return fact(n)/(fact(n-r)*fact(r));
   	   }

		// Function to find NPR by accepting n and r
    public static int npr(int n,int r) {
     		  return fact(n)/(fact(n-r));
   	  } 	
}	 