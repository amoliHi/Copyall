/* Write a program WindChill.java that takes two double command-line arguments t
  and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given 
  the temperature t (in Fahrenheit) and the wind speed v (in miles per hour), 
  the National Weather Service defines the effective temperature (the wind chill) to be:
 */

package Functional_Programs;
import java.util.Scanner;
public class WindChill 
{
	
/* --------------------- Function To calculate WindChill ------------------------- */	
	
	public static void WindChill(double t,double v)
	    {
		
	      double windchill=35.75+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);//Formula for windchill calculation
	
	      System.out.println("WindChill result is :"+Math.floor(windchill));
		
	    }
	
/* --------------------- Function To check limit of temperature and windspeed ------------------------- */	
	
	public static void Check()
	  {
   
		Scanner sc = new Scanner(System.in);
    
		System.out.println("Enter the temperature in Fahrenheit");
   
		double t=sc.nextDouble();
   
		System.out.println("Enter the Wind Speed in miles per hour");

        double v=sc.nextDouble();
    
        if(Math.abs(t)>50 || v>120 || v<3) //if true call check function
    
           {
    	
        	System.out.println("Farmula is not valid......\n 1)temperature should be Less than 50 ..\n 3)WindSpeed should be less than 120 and Greater than 3\n");
    	
        	Check(); 
       
           }
          
        else
    
           {
    	
        	WindChill(t, v); //if false call WindChill Function
   
           
           }
	}
	
	
/* --------------------- Main function first calls checks------------------------- */	
    public static void main(String[] args)
   
       {
    	  
    	   Check();
      
       }
  
}

/* ----------------------- End of the class -------------------------------------- */

