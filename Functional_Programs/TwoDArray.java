package Functional_Programs;
import java.io.PrintWriter;
import java.util.Scanner;
public class TwoDArray 
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int row=sc.nextInt();
		System.out.println("Enter the number of columns");
		int col=sc.nextInt();
	    int[][] Num1=new int[row][col];
	    double[][] Double1=new double[row][col];
		String[][] str1=new String[row][col];
		Num1=Num(row,col,Num1);
		str1=str(row,col,str1);                                                                                                                                                                                                                                                      
		Double1=Double(row,col,Double1);
		display1(Num1,row,col);
		display2(Double1,row,col);
		display3(str1,row,col);
		
	}
	public static int[][] Num(int row,int col,int[][] Num1)
	{
		System.out.println("For Integer Matrix");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<row;i++)
		{
		  for(int j=0;j<col;j++)
		  {
			   Num1[i][j]=sc.nextInt();
			  
		  }
		
	    }
	
		return Num1;
		
	}
	public static String[][] str(int row,int col,String[][] str1)
	{

		System.out.println("For String Matrix");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<row;i++)
		{
		  for(int j=0;j<col;j++)
		  {
			   str1[i][j]=sc.nextLine();
			  
		  }
		
	    }
		
	
		return str1;
		
	}
	public static double[][] Double(int row,int col,double[][] Double1)
	{

		System.out.println("For Double Matrix");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<row;i++)
		{
		  for(int j=0;j<col;j++)
		  {
			   Double1[i][j]=sc.nextDouble();
			  
		  }
		
	    }
		
	
		return Double1;
		
	}
	


	public static void display1(int[][] Num1,int row,int col)
	{
		System.out.println("************Integer Matrix*****************");
		PrintWriter p=new PrintWriter(System.out,true);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				p.print(Num1[i][j]+" ");
			}
			p.println();
		}
	}
	
	public static void display2(double[][] Double1,int row,int col)
	{
		System.out.println("************double Matrix*****************");
		PrintWriter p=new PrintWriter(System.out,true);
	    for(int i=0;i<row;i++)
	    {
			for(int j=0;j<col;j++)
			{
				p.print(Double1[i][j]+" ");
			}
			p.println();
		}
	}
	public static void display3(String[][] str1,int row,int col)
	{
	    System.out.println("************String Matrix*****************");
	    PrintWriter p=new PrintWriter(System.out,true);
	    for(int i=0;i<row;i++)
	    {
			for(int j=0;j<col;j++)
			{
				p.print(str1[i][j]+" ");
			}
			p.println();
		}

     }
}
