/* Factors

1) Desc -> Computes the prime factorization of N using brute force.

2) I/P -> Number to find the prime factors

3) Logic -> Traverse till i*i <= N instead of i <= N for efficiency.

4) O/P -> Print the prime factors of number N.

*/


/* ---------------------------------------------------------------------*/
package Basic_Core_Java_Programms;

import java.util.Scanner;

/* ----------------------- Class Declaration ---------------------  */

public class Factor {
	
/* --------------------- Function to check weather number is positive number ------- */
	
	public static void check()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ::");
	    int number = sc.nextInt();
	    if(number<0)
	    {
	    	System.out.println("Enter positive number");
	    	check();
	    }
	    else
	    {
	    	Prime(number); //Calling Prime Function
	    }
	}
	    
/* --------------------- Function to check Prime Number ------------------ */
	
	    public static void Prime(int number)
	    {
	    	boolean isPrime=true;
	    	for(int i=2;i<=number/2;i++)
	    	{
	    	int temp;
	    	
	    	temp=number%i;
	    	if(temp==0) 
	    	{
	    		isPrime=false;
	    		Factorization(number); //Calling Factorization method
	    		break;
	    		
	    	}
	    	
         }
	    	if(isPrime)
	    	{
	    		System.out.println("Entered number is prime number");
		    	check();	
	    	}
	}
	    
 /* --------------------- Function for Prime Factorization ------------------ */

   public static void Factorization(int number)
	{
		 for(int i = 2; i< number; i++)
		 {
	         while(number%i == 0) 
	         {
	            System.out.print(i+" ");
	            number = number/i;
		
	         }
	         
	     }
      
     if(2<=number)
     {
         System.out.println(number);
     }
     
   }

/* ------------------------ Main Function ---------------------- */
  
	public static void main(String args[])
   {
      check();
   } 
}

/* -------------------------- End of class Declaration ---------------------- */