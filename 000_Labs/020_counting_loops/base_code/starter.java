/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("name please:");
		String a = sc.nextLine();
		System.out.print("number please:");
		int b = sc.nextInt();
		int x = 1;
		while(true){
			if(x>b){
				break;
			}
		
		x = x+1;
		System.out.println(x + ". " + a);
		}



		
	}
}
