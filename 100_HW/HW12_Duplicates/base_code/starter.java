/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		System.out.println("-------------------------------------------\nThese are the 20 numbers");
		int[] a = new int[20]; //array with 20 elements
		int x;
		for (x = 0; x<20; x++){
			a[x] = (int)(Math.random()*10+1);
			System.out.print(a[x] + " ");
		} x = 0;
		System.out.println("\n-------------------------------------------");
		int t = (int)(Math.random()*10+1);
		System.out.println("the target number is: " + t);
		int d = 0;
		int y = 0;
		for (x = 0;x<20;x++){
			if(t==a[x]){
				y = x+1;
				d++;
				System.out.println("there is a duplicate at index " + y);
			}
			if (x==19)
			break;
			if(a[x]==a[x+1]){
				System.out.println("there is a consecutive line at index " + y + " of " + a[x]);
			}
		}System.out.println("there are " + d + " duplicates of " + t + "\n");
		for (x = 0;x<20;x++){
			y = x+1;
			if (x==19)
			break;
			if(a[x]==a[x+1]){
				System.out.println("there is a consecutive line at index " + y + " of " + a[x]);
			}
		}
		
		
		
	}
}
