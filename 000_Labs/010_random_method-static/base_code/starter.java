/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int a = (int) (Math.random()*10);
		System.out.println("random num from 0-9: " + a);
		int b = (int) (Math.random()*100+1);
		System.out.println("sum number from 1-100: " + b);
		double c = Math.random()+2.5;
		System.out.println("2.5 - 3.5 for some reason: " + c);
		double d = (Math.random()*575)+14;
		System.out.println("14 - 598 PLEASE WORK: " + d);
		
	}
}
