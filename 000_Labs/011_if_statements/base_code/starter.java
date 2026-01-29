/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int a = (int) (Math.random()*100);
		int b = (int) (Math.random()*100);
		System.out.println("ON THE LEFT CORNER WITH A RANDOMABILTIY OF 0 - 100 ISSSSS: " + a);
		System.out.println("ON THE RIGHT CORNER WITH THE SAME RANDOMABILITY ISSSSSSSS: " + b);
		if(a!=b)
		{
			System.out.println("Wow its different!!!");
			if (a>b)
			{
				System.out.println("THE WINNER IS A!!!!!");
				
			}
			if (a<b)
			{
					System.out.println("THE WINNER IS B!!!!!");
			}
				
			
		}
		if (a==b)
		{
			System.out.println("NO WAY ITS A TIE!!!!! THE ODDS ARE CRAZY!!!!!! CONGRATULATIONS!!!!!");
		}
	}
}
