package Logical_Programs;
import java.util.Scanner;
public class Coupon_Number 
{
//Functions returns  random coupon between 0 and n-1
	public static int getCoupon(int n)
	{
		
		return(int) 
	    (Math.random()*n);
	}
	

//Function to return number of cards 
	public static int Collect(int n)
	{
		boolean[] isCollected=new boolean[n]; // check whether it's a new one.
		int count=0; // Number of cards collected
		int distinct=0; //Number of distinct cards type collected
	
//Repeat untill you have collected all N card types
		while(distinct<n)
		{
			int value=getCoupon(n); //pic a random card
			count++; //One more card
			if(!isCollected[value]) //discover new card type
			{
				
			distinct++;
			isCollected[value]=true;
			
		}
	}
		return count;
}
	
//Main method for user input
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N Distinct Coupon Number");
		int n=sc.nextInt(); //read coupon number
		int count=Collect(n);
		System.out.println(count);
		
	}
}
 