/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Create your accounts what info would you like to inupt:\n	1. no info\n	2. name\n	3. name and inital deposit");
		int ans = sc.nextInt();
		sc.nextLine();
		BankAccount account = new BankAccount();
		if(ans == 1){
			account = new BankAccount();
			System.out.println("\nAccount created!\n");
		}
		else if(ans == 2){
			System.out.println("\nWhat is the name of your account:");
			account = new BankAccount(sc.nextLine());
		}
		else if(ans == 3){
			System.out.println("\nWhat is the name of your accounts:");
			String name = sc.nextLine();
			System.out.println("\nWhat is the deposit amount:");
			double money = sc.nextDouble();
			sc.nextLine();
			account = new BankAccount(name, money);
		}
		else {
			System.out.println("invalid"); 
			System.exit(0);
		}
		account.displayAccountInfo();
		System.out.println("\nWould you like to check your balance?");
		
		String bob = sc.nextLine().toLowerCase();
		if (bob.equals("yes")){
			account.checkBalance();
		}
		else if (bob.equals("no")){
			System.out.println("\nOkay! no balance checked.");
		}
		else{
			System.out.println("\nits yes or no stpid");
		}
		System.out.println("\nThanks for coming!");
	}
}
