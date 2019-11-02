package Functional_Programs;
import java.util.Scanner;
public class Quadratic 
{
	public static void main(String[] args)
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for a");
		double a=sc.nextInt();
		System.out.println("Enter the Value for b");
		double b=sc.nextInt();
		System.out.println("Enter the value for c");
		double c=sc.nextInt();
		double result=b*b-4.0*a*c;
		if(result>0.0)
		{
			double r1=(-b+Math.sqrt(result))/(2*a);
			double r2=(-b-Math.sqrt(result))/(2*a);
			System.out.println(" The Roots Are " +r1+ " And " +r2+ "  ");
			
		}
		else if(result==0)
		{
			double r1=-b/(2.0*a);
			System.out.println("Root is " +r1);
		}
		else
		{
			System.out.println("Equation has no roots");
		}
	}

}
