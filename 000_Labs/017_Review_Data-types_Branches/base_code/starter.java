/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What shall I call you, Traveller:\n");
		String name = sc.nextLine();
		System.out.print("Great, now what would your title be:\n");
		String title = sc.nextLine();
		System.out.print("Now, what class would you perfer? You can be a Hero, Mage, Warrior, or Healer:\n");
		String role;
		role = sc.nextLine();
		if (role.equals("Hero")||role.equals("hero")){
			System.out.println("A Hero! How Spectacular!");
		}
		else if (role.equals("Mage")||role.equals("mage")){
			System.out.println("A Mage! How Exhilarating!");
		}
		else if (role.equals("Warrior")||role.equals("warrior")){
			System.out.println("A Warrior! How Adventurous!");
		}
		else if (role.equals("Healer")||role.equals("healer")){
			System.out.println("A Healer! How Supportive!");
		}
		else{
			System.out.println("Seems like you would rather be not be anything. You can reset.");
			role = new String("nun");
		}
		System.out.print("\nNow, because I'm so giving, I'll give you 20 skill points to use it on: Strength, Defense, Intelligence, and  Popularity.\nYou can only put a maximum of 10 skill points into one skill. Chose wisely.\n\nStrength: ");
		int st; 
		st = sc.nextInt();
		while (st>10){//strength is over 10
			System.out.print("Only a maximum of 10: ");
			st = sc.nextInt();
		}
		int rem;
		rem = 20-st;
		System.out.print("Okay, you have " + rem + " points left\n\nDefense: ");
		int de;
		de = sc.nextInt();
		while(de>10){//defense is over 10
			System.out.print("Only a maximum of 10: ");
			de = sc.nextInt();
		}
		rem = rem-de;
		System.out.print("Okay, you have " + rem +" points left\n\nIntelligence: ");
		int in = sc.nextInt();
		while (in>10){//intelligence is over 10
			System.out.print("Only a maximum of 10: ");
			in = sc.nextInt();
		}
		if(in>rem){//intelligence is over the remainder
		System.out.print("You only have " + rem + " left: ");
		in = sc.nextInt();
		}
		rem = rem-in;
		System.out.print("Okay, you have " + rem +" points left\n\nPopularity: ");
		int pop = sc.nextInt();
		while (in>10){//Popularity is over 10
		System.out.print("Only a maximum of 10: ");
		pop = sc.nextInt();
		}
		if(pop>rem){//Popularity is over the remainder
		System.out.print("You only have " + rem + " left: ");
		pop = sc.nextInt();
		}
		rem = rem-pop;
		if(rem!=0){
			System.out.println("Seems like you have " + rem + " points left. You can save it for later Adventures.");
		}
		System.out.print("\n------------------------------\nYou are " + name + ", the " + title + " of this world.");
		if (role.equals("nun")){
			System.out.println("\nYou decided to have no class but you have:\n Strength level: " + st + "\n Defense level: " + de + "\n Intelligence level: " + in + "\n Popularity level: " + pop + "\n\nBest of luck on your adventure, " + name + "!");
		}
		else{
		System.out.println("\nYou are a " + role + " with:");
		System.out.print(" Strength level: " + st + "\n Defense level: " + de + "\n Intelligence level: " + in + "\n Popularity level: " + pop + "\n\nBest of luck on your adventure, " + name + "!");
		}
	}
}
