/*
 *	Author:Ian Park  
 *  Date: idk
*/

import pkg.*;
import java.util.*;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick an option:\n 1. Scramble\n 2. Play the game");
		String ans = sc.nextLine().toLowerCase().trim();
		if(ans.equals("1")||ans.equals("scramble")){
			System.out.println("Input something to scramble:");
			String scramble = sc.nextLine();
			
		}
	}
}
