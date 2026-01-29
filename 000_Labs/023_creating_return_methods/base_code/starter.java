/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
		
	public static int pow(int a, int b){
	int mult = 1;
	int ab = a;
	while(mult<b){
	a = a*ab;
	mult = mult+1;
	
		}
	int ans = a;
	return ans;
	}	
	
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("heya whats the base number ganna be? ");
	int num1 = sc.nextInt();
	System.out.print("okok whats your exponent? ");
	int num2 = sc.nextInt();
			
	System.out.println("your answer is: " + pow(num1,num2));
	}
}
