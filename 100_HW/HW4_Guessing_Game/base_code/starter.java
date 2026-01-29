/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey, lets play a guessing game! You get 2 hints!");
		int ans;
		ans = (int)(Math.random()*3+1);
		if (ans==1){//chocolate
			System.out.println("\nFirst hint: It's edible.");
			String choco;
			choco = sc.nextLine().toLowerCase();
			if (choco.equals("chocolate")){
				System.out.println("\nWow! You got it right !");
			}
			else{
				System.out.println("\nWrong! Thats ok though!\nSecound hint: You can dip strawberries into it.");
				choco = sc.nextLine().toLowerCase();
				if(choco.equals("chocolate") || choco.equals("Chocolate")){
					System.out.println("\nWow! You got it right !");
				}
				else{
					System.out.println("\nUnlucky... It was Chocolate :c. Next time tho!");
				}
			}
		}
		else if (ans==2){
			System.out.println("\nFirst hint: It's main purpose is to make sound/noise.");
			String drum;
			drum = sc.nextLine().toLowerCase();
			if (drum.equals("drum")||drum.equals("drums")){
				System.out.println("\nWow! You got it right !");
			}
			else{
				System.out.println("\nWrong! Thats ok though!\nSecound hint: You need sticks to play this.");
				drum = sc.nextLine().toLowerCase();
				if(drum.equals("drum") || drum.equals("drums")){
					System.out.println("\nWow! You got it right !");
				}
				else{
					System.out.println("\nUnlucky... It was drum :c. Next time tho!");
				}
			}
		}
		else if (ans==3){
			System.out.println("\nFirst hint: It is a building you can enter.");
			String rest;
			rest = sc.nextLine().toLowerCase();
			if (rest.equals("restaurant") || rest.equals("Restaurant")){
				System.out.println("\nWow! You got it right !");
			}
			else{
				System.out.println("\nWrong! Thats ok though!\nSecound hint: You eat here.");
				rest = sc.nextLine().toLowerCase();
				if(rest.equals("restaurant") || rest.equals("Restaurant")){
					System.out.println("\nWow! You got it right !");
				}
				else{
					System.out.println("\nUnlucky... It was Restaurant :c. Next time tho!");
				}
			}
		}
	}
}
