package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	public Spiderman(){// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
		actor = "unknown";
		age = 0;
		villain = "unknown";
	}
	public Spiderman(String a){// String Actor constructor! 			Age - 0, Villain Unknown 
		actor = a;
		age = 0;
		villain = "unknown";
	}
	public Spiderman(int o){// int Age constructor! 				Actor - Unknown, Villain Unknown
		actor = "unknown";
		age = o;
		villain = "unknown";
	}
	public Spiderman(String a, int o){// String Actor, int Age constructor! 	Villain Unknown
		actor = a;
		age = o;
		villain = "unknown";
	}
	public Spiderman(String a, int o, String v){// String Actor, int Age, String Villain constructor!		
		actor = a;
		age = o;
		villain = v;
	}
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	public String getActor(){
		return this.actor;
	}
	public int getAge(){
		return this.age;
	}
	public String getVillain(){
		return this.villain;
	}
	
	
	public void setActor(String actor){
		this.actor = actor;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setVillain(String villain){
		this.villain = villain;
	}

	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
