package functional_program;

import java.util.Scanner;

public class Coupon {
	// return a random coupon between 0 and n-1
	public static int getCoupon(int N)
	{
		 return (int) (Math.random() * N);
		
	}
	
	 // return number of cards you collect before obtaining one of each of the n types
	public static int collect(int N) {
        boolean[] isCollected = new boolean[N];  // isCollected[i] = true if card type i already collected
        int count = 0;                           // number of cards collected
        int distinct  = 0;                       // number of distinct card types collected

        // repeat until you've collected all n card types
        while (distinct < N) {
            int value = getCoupon(N);            // pick a random card 
            count++;                             // one more card
            if (!isCollected[value]) {           // discovered a new card type
                distinct++;
                isCollected[value] = true;
            }
        }
        return count;
    }

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int N =sc.nextInt();
	        int count = collect(N);        
	        System.out.println(count);
		

	}

}
