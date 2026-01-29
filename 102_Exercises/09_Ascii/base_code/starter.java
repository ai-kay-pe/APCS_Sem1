/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey, pick one:\n Technology\n Object\n Face");
		String pick = sc.nextLine().toLowerCase();
		if(pick.equals("technology")){
			System.out.println(" __________");
			System.out.println("|         |\n|         |\n|         |");
			System.out.println("|_________|");
			System.out.println("Its an Ipad");
			
		}
		else if(pick.equals("object")){
			System.out.println("  _____");
			System.out.println(" /     \\");
			System.out.println("|       |");
			System.out.println(" \\     /");
			System.out.println("  -----");
			System.out.println("Its a vase.");
		}
		else if(pick.equals("face")){
			System.out.println("  |   |");
			System.out.println("        ");
			System.out.println("   '' ");
			System.out.println(" \\     /");
			System.out.println("  -----");
			System.out.println("Its a smily");
		}
		else {
			System.out.println("nah, wrong");
		}
	}
	
}
