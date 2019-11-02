/* Harmonic Number 

1) Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N (http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).

2) I/P -> The Harmonic Value N. Ensure N != 0

3) Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N

4) O/P -> Print the Nth Harmonic Value.

*/

/* ------- Declaration of packages ------------------ */
package Basic_Core_Java_Programms;
import java.util.Scanner;



/* ----------- Class Declaration ----------------------- */
public class Harmonic_Number 
{
	
/* ---------- Function to Check Valid Number ----------------- */
	public static void check()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Nth Number\n");
		int n=sc.nextInt();
		if(n>0)
		{
			 //Calling Function (Calculating nth harmonic series)
			System.out.println("Nth value of Harmonic is : "+Harmonic(n));
		}
		else
		{
			System.out.println("Dont Give 0 or negative numbers ");
			check();
		}
	}

/* ---------------------- Function to Calculate Nth Harmonic Value -------------------- */
	
	static float Harmonic(int n) 
	{
		
		float harmonic=1;
		for(int i=1;i<n;i++)
		{
			
			harmonic +=(float)1/i;
			
		}
		return harmonic;
		
		
		
	}

/* --------------------------  Main Function --------------------- */
public static void main(String[] args)
{
	check();
}
}

