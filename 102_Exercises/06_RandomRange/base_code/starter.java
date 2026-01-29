/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("hey bro. pick a starting range: ");
		int a = sc.nextInt();
		System.out.print("thats great. now pick the end range: ");
		int b;
		b = sc.nextInt();
		while(a > b){
			System.out.println("hey bro. the 2nd number gatta be bigger than teh first you have to knwo that");
			System.out.print("write it again:");
			b = sc.nextInt();
		}
		System.out.println("\nalright thats great here are 5 randomly generated numbers between " + a + " and " + b + ": ");
		System.out.println((int)(Math.random()*(b-a)+a) + ", " + (int)(Math.random()*(b-a)+a) + ", " + (int)(Math.random()*(b-a)+a) + ", " + (int)(Math.random()*(b-a)+a) + ", and " + (int)(Math.random()*(b-a)+a));
	}
}
