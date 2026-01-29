/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		BaseClass BaseClass = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("hey. do it. rows:");
		int rowah = sc.nextInt();
		System.out.println("columns:");
		int columnah = sc.nextInt();
		System.out.println("");
		
		int[][] RAH = new int[rowah][columnah];
		
		for(int r = 0; r<RAH.length; r++){
			for(int c = 0; c<RAH[0].length; c++){
				RAH[r][c]=(int)(Math.random()*10+1);
			}
		}
		BaseClass.printArray(RAH);
		
		System.out.println("what row do you wanna get ave of:");
		int rr = sc.nextInt();
		
		BaseClass.avRow(RAH,rr);
		


		
	}
}
