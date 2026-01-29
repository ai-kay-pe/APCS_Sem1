/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("write a nubmer out(decimal shall be accpeted, unlike mr. poole's design): ");
		double ikp = sc.nextDouble();
		System.out.println("aight we can guess the next numbers: ");
		System.out.println((ikp+1) + ", " + (ikp+2) + ", " + (ikp+3) + ", " + (ikp+4) + ", and " + (ikp+5) + "!!");
		System.out.println("ok but what would be even crazier woudl be to write the next 5 multiples of " + ikp + ":");
		System.out.println((ikp*2) + ", " + (ikp*3) + ", " + (ikp*4) + ", " + (ikp*4) + ", and " + (ikp*5) + "!!!!");
		System.out.println("divided by 100 now:");
		System.out.println(ikp/100 + "!!");
		System.out.println("divided by 10 now:");
		System.out.println(ikp/10 + "!!!!!");
		System.out.println("bye now!");
		
		

	}
}
