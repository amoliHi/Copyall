package Logical_Programs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class StopWatch
{

	public long startTimer=0;
	public long stopTimer=0;
	public long elapsed;
	
	public void start()
	{
		startTimer=System.currentTimeMillis();
		System.out.println("Time Starter starts at  : " +startTimer+ "  Milli Seconds");
	}
	
	public void stop()
	{
		stopTimer=System.currentTimeMillis();
		System.out.println("Time Stopper at  :" +stopTimer+ "  milli seconds");
	}
	public long getElapsedTime()
	{
		elapsed=stopTimer-startTimer;
		return elapsed;
	}
	
	public int inputInteger(){
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
				try {
				  int size = Integer.parseInt(br.readLine());
				} 
				catch (NumberFormatException e)
				{
				  e.printStackTrace();
				} 
				catch (IOException e) 
				{
					
					 e.printStackTrace();
				}
			
		return 0;
	}
	public static void main(String[] args)
	{
		StopWatch sw=new StopWatch();
		System.out.println("press any number to start the timer");
		sw.inputInteger();
		sw.start();
		System.out.println("Press any number to stop the timer");
		sw.inputInteger();
		sw.stop();
		long l=sw.getElapsedTime();
		System.out.println("total elapsed time in milli seconds :"+l);
		
	    System.out.println();
		System.out.println("converting milli seconds to seconds  : "+(l/1000));
		
		
	}
	
}
