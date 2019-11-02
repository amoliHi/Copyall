package Functional_Programs;
import java.util.Scanner;
public class Distance 
{
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values for Co-ordinates");
		System.out.println("Enter the Value for X1");
		double x1=sc.nextDouble();
		System.out.println("Enter the Value for X2");
		double x2=sc.nextDouble();
		System.out.println("Enter the Value for Y1");
		double y1=sc.nextDouble();
		System.out.println("Enter the Value for Y2");
		double y2=sc.nextDouble();
		double xDiff=x2-x1;
	    double  xSqr  = Math.pow(xDiff, 2);
	    
	    double yDiff=y2-y1;
	    double ySqr= Math.pow(yDiff,2);
	    
	    double output   = Math.sqrt(xSqr + ySqr);
		
		System.out.println("Distance = " + output);  
		
	}

}
