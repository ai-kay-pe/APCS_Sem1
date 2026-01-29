/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("pick a number between 1 and 1000: ");
		int num = (int) (Math.random()*1000);
		int a = sc.nextInt();
		if (num == a) {
			System.out.println("NO FRICKING WAY YOU GOT IT!!!!!");
		}
		if (num > a) {
		System.out.println("ummm nice try your alittle low tho..");
		}
		else if (num < a){
		System.out.println("yeah your number alittle high..");
		}
	}
}
