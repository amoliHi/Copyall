package functional_program;
import java.util.Scanner;

public class SomeOfInteger {
	
	public static int findDistinctTriplet(int arr[],int length)
	{
		System.out.println();
		int count=0;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				for(int k=j+1;k<length;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.println(arr[i]+ " " + arr[j]  +" " +arr[k]);
								
						count++;
					}
				}
			}
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		SomeOfInteger t1= new SomeOfInteger();
		int sum=t1.findDistinctTriplet(arr,n);
		System.out.println("No.of Tripltes :"+sum);
		System.out.println();
		
	}


		
		
		

	}


