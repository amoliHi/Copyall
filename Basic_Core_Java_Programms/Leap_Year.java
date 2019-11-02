package Basic_Core_Java_Programms;
import java.util.Scanner;
/* ----------Class Creation -----------------*/
public class Leap_Year
{

/* ----------Function to Check Year----------*/
	
	public static void check()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=sc.nextInt();
		 if ((year > 999 && year < 9999)) //Condition to check weather you have entered  
			                               //year contains 4 digits or not
		 {
			 leapYear(year);	//Calling Function 
		 }
		 else
		 {
			 
			 System.out.println("Entere Proper Year"); 
			 check(); //Repeat Function to insert proper year
			
		 }
		
	}
	
/* -------------- Function To Check Leap Year ----------------- */

   public static void leapYear(int year)
    {
    	
	 if((year%400==0 || year%100!=0) && year%4==0)
		    System.out.println(year+ "Is a Leap Year");
	 else
		    System.out.println(year+ "Is not Leap Year");
	}
   
   
    
 /* -------------- Main Function --------------- */
    public static void main(String[] args)
	{
		
		check(); //Calling Function
	}
    
}


