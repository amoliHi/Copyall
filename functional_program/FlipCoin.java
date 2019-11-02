package functional_program;
import java.util.Scanner;
public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int headCount=0;
		int tailCount=0;
		double percentage=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of flip you want: ");
		int flip=sc.nextInt();
		for(int i=1; i<=flip; i++)
		{
		
			boolean result=calculatePercentage();
			if (result==true)
				headCount++;
			else
				tailCount++;
		 }
		double head_per=(headCount*100)/flip;
		double tail_per=(tailCount*100)/flip;
		System.out.println("percentage of Head is =" + head_per );
		System.out.println(" percentage of tail is= "+ tail_per);
                                                                                                               
	}
	public static boolean calculatePercentage()
	{

		double result;

		result = Math.random();

		if(result <= .5)

			return true;


	return false;	
		
	}

	}


