package functional_program;

public class Gambler {

	public static void main(String[] args) {
		int stake= Integer.parseInt(args[0]);
		int goal=Integer.parseInt(args[1]);
		int trial=Integer.parseInt(args[2]);
		
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
		}
		System.out.println(wins + " wins of " + trial);
        System.out.println("Percent of games won = " + 100.0 * wins / trial);
        System.out.println("Avg # bets           = " + 1.0 * bets / trial);
		
		
	}

}
