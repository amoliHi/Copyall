package functional_program;
import java.util.Scanner;
public class PrimkeFactor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int N=sc.nextInt();
		primeFactor(N);
		

	}
	static void primeFactor(int N)
	{
		 // Print the number of 2s that divide n 
		if(N%2==0)
		{
			System.out.print(2 + " ");
			N=N/2;
		}
		 /**
		 *n must be odd at this point.  So we can 
        * skip one element (Note i = i +2)
        */
		for(int i=3;i<=Math.sqrt(N);i++)
		{
			// While i divides n, print i and divide n 
			while(N%i==0)
			{
				System.out.print(i + " ");
				N=N/i;
			}
			
		}
		/**
		 * his condition is to handle the case whien 
		 * n is a prime number greater than 2 
		 */
		if(N>2)
			System.out.println(N);
		
	}

}
