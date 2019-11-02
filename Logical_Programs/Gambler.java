/* Gambler

1)Desc -> Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of times he/she wins and the number of bets he/she makes. Run the experiment N times, averages the results, and prints them out.

2)I/P -> $Stake, $Goal and Number of times

3)Logic -> Play till the gambler is broke or has won

4)O/P -> Print Number of Wins and Percentage of Win and Loss.
      
*/

package Logical_Programs;
import java.util.Scanner;
public class Gambler
{
    public static void main(String[] args) {
	
    Scanner sc=new Scanner(System.in);
	
    System.out.println("Enter the Stakes");
	
    int stake= sc.nextInt();
	
    System.out.println("Enter the Goals");
	
    int goal=sc.nextInt();
	
    System.out.println("Enter the Number of Attempts");
	
    int trial=sc.nextInt();
	
    int los=0;
	
    int bets=0; //total no of bets
	
    int wins=0; // total no of wins
	 // repeat trials times
	  for(int t=0;t<trial;t++)
		{
		  int cash=stake;

          while(cash>0 && cash<goal)
			 {
				bets++;
				
				if(Math.random()< 0.5)
					
					cash++;
				else
					cash--;
				
			 }
			
                if(cash==goal)
		      		  
                    wins++;
                else
				    los++;
		}
		System.out.println(wins + " wins of " + trial);
		System.out.println(los + " loss of " + trial);

        System.out.println("Percent of games won = " + 100.0 * wins / trial);
        System.out.println("Avg # bets           = " + 1.0 * bets / trial);
		
		
	}

}