package functional_program;

public class Distance {
	static double euclideanDistance(int x, int y)
	{
		double distance=Math.sqrt(x*x + y*y);
		return distance;
	}

	public static void main(String[] args) {
		int x= Integer.parseInt(args[0]);
		int y= Integer.parseInt(args[1]);
		double result=euclideanDistance(x,y);
		System.out.println(result);
		
	}

}
