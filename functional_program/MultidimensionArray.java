package functional_program;
import java.util.Scanner;

public class MultidimensionArray {

	public static void main(String[] args) {
		 //creating Scanner object
		Scanner input= new Scanner(System.in); 
		// taking input from user
		System.out.println("Enter the row size:");    
		int rowSize=input.nextInt();
		System.out.println("Enter the Column size:");
		int columnSize=input.nextInt();
		// creating 2d array
		int arr[][]=new int[rowSize][columnSize];
		
		for(int i=0;i<rowSize;i++)
		{
			for(int j=0;j<columnSize;j++)
			{
				arr[i][j]=input.nextInt();
				
			}                                                                                                              
		}
	    System.out.println("Array is : ");

		/**
		 * print 2d array
		 */
		for(int i=0;i<rowSize;i++)
		{
			for(int j=0;j<columnSize;j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
