/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input #:");
		int jimmyjohn = sc.nextInt();
		printPrimes(jimmyjohn);
		System.out.println("2");
		}
	public static boolean checkPrime(int a){
		int x = a;
		int y = x-1;
		
		while(x%y!=0){
			y=y-1;
			if(y==1)
			return true;
		}
		return false;
	}
	public static void printPrimes(int a){
		int x = a;
		while (x>=2){
		//	System.out.println(x);
			if (checkPrime(x)){
			System.out.println(x);
			}
		x = x-1;
		}
	}
}
