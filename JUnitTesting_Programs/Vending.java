/* 
 Desc -> There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be returned by Vending Machine.
 
 Write a Program to calculate the minimum number of Notes as well as the Notes to be returned by the Vending Machine as a
 
 Change

 1) I/P -> read the Change in Rs to be returned by the Vending Machine

 2)Logic -> Use Recursion and check for largest value of the Note to return change to get to minimum number of Notes. 

 3)O/P -> Two Outputs - one the number of minimum Note needed to give the change and second list of Rs Notes that would given in the Change

*/


package JUnitTesting_Programs;
import java.util.Scanner;
public class Vending 
{
	
	//Number of notes to be returned by the vending machine
	
	public static void CountCurrency(int amount)
	{
		int[] notes=new int[] {2000,500,200,100,50,20,10,5,1};
		int[] NoteCounter=new int[9];
		for(int i=0;i<9;i++)
		{
			if(amount>=notes[i])
			{
				NoteCounter[i]=amount/notes[i];
				amount=amount-NoteCounter[i]*notes[i];
			}
		}
		//Print Notes
				System.out.println("Currancy Count----->");
				for(int i =0 ; i< 9;i++)
				{
					if(NoteCounter[i]!=0)
					{
						System.out.println(notes[i]+"---------> "+NoteCounter[i]);
					}
				}
				
			}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount");
		int amount=sc.nextInt(); 
        CountCurrency(amount); 
		
	}
		
}


	
	
