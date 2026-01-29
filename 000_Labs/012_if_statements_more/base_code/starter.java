/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("write your number: ");
		int a = sc.nextInt();
		System.out.print("now your other number: ");
		int b = sc.nextInt();
		System.out.println("");
		if(a==b){
			System.out.println("Wow! they are the same!!!");
		}
		if (a!=b){
			System.out.println("they are different...");
		}
	}
}
