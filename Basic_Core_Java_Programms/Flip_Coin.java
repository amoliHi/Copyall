/* 

Flip Coin and print percentage of Heads and Tails

1) I/P -> The number of times to Flip Coin. Ensure it is positive integer.

2) Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads

3)O/P -> Percentage of Head vs Tails 

*/

/* *************************************************************** */

package Basic_Core_Java_Programms;

import java.util.Scanner;
/* -------------- Class Flip_Coin--------  */
public class Flip_Coin 
{
	

/* --------- Function to check Positive Number or not---------- */

	 public static void check()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of flips you want??");
		int n=sc.nextInt();
		if(n>0)
		{
			Flip(n);
			
		}
		else
		{
			System.out.println("Enter the positive number");
			check();
		}
	}
	 
/* ------------- Flip Percentage Calculation ----------------- */

	public static void Flip(int n)
	{
		int tailcount=0;
		int headcount=0;
		for(int i=0;i<n;i++)
		{
			if(Math.random()<0.5) //Generating Random Numbers and comparing with given 0.5
				tailcount++;   //Increment Tail count if true
				else
			    headcount++;   //if not Increment Head count
		}
		 double per_Head=(headcount*100)/n; //Percentage of Head vs Tail
		 double per_tail=(tailcount*100)/n; 
		 System.out.println("Percentage of Headcount is"+per_Head);
		 System.out.println("Percentage of tailcount is"+per_tail); 
	}
	 
	
/* ----------- Main Function ------------ */
	public static void main(String[] args)
	{
		check(); //calling Function
	}
	
}
	
/* ---------------- End of class --------------- */
