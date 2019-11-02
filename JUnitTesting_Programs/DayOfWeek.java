package JUnitTesting_Programs;
import java.util.Scanner;
public class DayOfWeek 

{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Date"); 
		int d=sc.nextInt();
		System.out.println("Enter the Month");
		int m=sc.nextInt();
		System.out.println("Enter the Year");
		int y=sc.nextInt();
		System.out.println("Day of the week is"+Util.DayOfWeek(m, d, y));
		
	}

}
