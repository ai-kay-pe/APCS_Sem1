/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman tobey = new Spiderman("Tobey Maguire", 48, "Green Goblin");
		Spiderman andrew = new Spiderman("Andrew Garfield", 40, "Electro");
		Spiderman tom = new Spiderman("Tom Holland", 27, "The Vulture");
		Spiderman nico = new Spiderman("Nicolas Rase", 16, "Ian Kwon Park");
		
		System.out.println("Actor: " + tobey.getActor() + " Age: " + tobey.getAge() + " Villain: " + tobey.getVillain());
		System.out.println("Actor: " + andrew.getActor() + " Age: " + andrew.getAge() + " Villain: " + andrew.getVillain());
		System.out.println("Actor: " + tom.getActor() + " Age: " + tom.getAge() + " Villain: " + tom.getVillain());
		System.out.println("Actor: " + nico.getActor() + " Age: " + nico.getAge() + " Villain: " + nico.getVillain());
		System.out.println("----------------------------------------------------");
		nico.fight();
		nico.printArt();
		
		
	}
}
