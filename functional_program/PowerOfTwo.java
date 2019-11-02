package functional_program;
import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int N=sc.nextInt();
		if(N<31)
		{
			for(int i=1;i<=N;i++)
			{
				System.out.println(N+" * "+i+" = "+N*i);
			}
		
		
		}
		else
			System.out.println("number should be less then 31");
	}

}
