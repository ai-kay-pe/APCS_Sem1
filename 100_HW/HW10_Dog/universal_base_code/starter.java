/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog ian = new Dog("Ian", 21);
		Dog bob = new Dog("Nico", "Austrian/German Ugly boy");
		boolean nai = ian.isSleeping();
		boolean boo = bob.isSleeping();
		
		if (nai){
			System.out.println(ian.getName() + " is sleeping.");
			if(boo){
				System.out.println(bob.getName() + " is sleeping.");
			}
			else{
				System.out.println(bob.getName() + " is awake.");
			}
		}
		else{
			System.out.println(ian.getName() + " is a awake!");
			ian.bark();
			if(boo){
				System.out.println(bob.getName() + " hears " + ian.getName() + " while sleeping");
				bob.bark();
			}
			else{
				System.out.println(bob.getName() + " hears " + ian.getName());
				bob.bark();
			}
		}



	}
}
