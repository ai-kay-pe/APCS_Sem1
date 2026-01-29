/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("number: ");
		int a = sc.nextInt();
		System.out.print("number2: ");
		int b = sc.nextInt();
		if(a%2==0){//number1 even
			System.out.println("\n"  + a + " is even!");
		}
		if (a%2!=0){//number1 odd
			System.out.println("\n" + a + " is odd!");
		}
		int a3 = a%3;
		int a4 = a%4;
		int a5 = a%5;
		if(a3==0){//number1 divide 3
			System.out.println(a + " can be divided by 3!");
		}
		if(a4==0){//number1 divide 4
			System.out.println(a + " can be divided by 4!");
		}
		if(a5==0){//number1 divide 5
			System.out.println(a + " can be divided by 5!");
		}
		if(a3!=0 && a4!=0 && a5!=0){//number1 cannot be divided
			System.out.println("\n" + a + " cannot be divided by 3, 4, or 5!");
		}
		if(b%2==0){//number2 even
			System.out.println("\n" + b + " is even!");
		}
		if(b%2!=0){//number2 odd
			System.out.println("\n" + b + " is odd!");
		}
		int b3 = b%3;
		int b4 = b%4;
		int b5 = b%5;
		if(b3==0){//number2 divide 3
			System.out.println(b + " can be divided by 3!");
		}
		if(b4==0){//number2 divide 4
			System.out.println(b + " can be divided by 4!");
		}
		if(b5==0){//number2 divide 5
			System.out.println(b + " can be divided by 5!");
		}
		if(b3!=0 && b4!=0 && b5!=0){//number2 cannot be divided
					System.out.println("\n " + b + " cannot be divided by 3, 4, or 5!");
		}	
	}
}
