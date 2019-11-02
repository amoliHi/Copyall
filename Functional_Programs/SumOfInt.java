package Functional_Programs;
import java.util.Scanner;
public class SumOfInt 
{
	
	public static void FindSum(int[] a)
	{
		boolean Found=true;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]+a[k]==0)
					{
						System.out.print(a[i]);
						System.out.print(" ");
						System.out.print(a[j]);
						System.out.print(" ");
						System.out.print(a[k]);
						System.out.print("\n ");
						Found=true;
						
					}
					
				}
			}
		}
		    
		
	}

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of an array");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		System.out.println("Elements Founded Are");
		FindSum(a);
	}
}
