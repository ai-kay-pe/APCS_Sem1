/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Heya you like testing right? here are the rules.\n1. you start with $100\n2. bet however many you want as long as its less that your amount\n3. We will role 3 number 1- 10 andddddd:\n	a. if you 2 of the same numbers you win double!\n	b. you get 3 numbers you triple it!\n	c. you get no numbers matching you lose the money you bet!\n----------------------------------------------------------------------------------------------------\n\n");
		int money = 100;
		int bet = 0;
		int slot1 = (int)(Math.random()*10+1);
		int slot2 = (int)(Math.random()*10+1);
		int slot3 = (int)(Math.random()*10+1);
		String ans;
	while(true){
		System.out.print("Would you like to play? ");
		ans = sc.nextLine().toLowerCase();
		if(ans.equals("no")||ans.equals("n")){
		System.out.print("ok you ended up leaving with $" + money + "! Bye!");
		return;
		}
		else if(ans.equals("yes")||ans.equals("y")){
			
			while(true){
			System.out.print("how much would you like to wager:");
			bet = sc.nextInt();
			sc.nextLine();
			if(bet>money||bet<0){
				System.out.println("nu huh");
			} else{
			break;
			}
			}  
			slot1 = (int)(Math.random()*11);
			slot2 = (int)(Math.random()*11);
			slot3 = (int)(Math.random()*11);
			System.out.println("Alrighty what have you rolled!\n\n_____________\n| " + slot1 + " | " + slot2 + " | " + slot3 + " |\n_____________\n");
			if(slot1==slot2&&slot1==slot3){
				System.out.println("WOWEEEE YOU GOT THREE");
				money = money+(bet*2);
				System.out.println("Alrighty you now have $" + money + " now!");
			} else if (slot1==slot2||slot1==slot3||slot2==slot3){
				System.out.println("You got a double!!!!");
				money = money+bet;
				System.out.println("Alrighty you now have $" + money + " now!");
			} else {
				System.out.println("Damn bru you lost $" + bet + ". Unlucky");
				money=money-bet;
				if(money==0){
				System.out.print("You've lost all your money... byeee");
				return;
				}
			}
		}
		else {
		System.out.println("invalid ");
		}
	}
}
}


