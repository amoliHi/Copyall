package functional_program;
import java.util.Scanner;
public class HarmonicSeries {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth term");
		int N=sc.nextInt();
		System.out.println(nthHarmonic(N));

	}
	static double nthHarmonic(int N)
	{
		float harmonic=1;
		for(int i=2;i<=N;i++)
		{
			harmonic+=(float)1/i;
		}
		return harmonic;
	}

}
