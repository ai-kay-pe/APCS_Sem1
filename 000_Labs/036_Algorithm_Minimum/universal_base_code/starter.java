/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] arr = new int[(int)(Math.random()*(200-51+1)+51)];
		int x = 0;
		while (x<arr.length){
			arr[x] = (int)(Math.random()*101);	 
			x = x+1;
		} int y = 0;
		int ave = 0;
		int max = -1;
		int min = 101;
		while (y<arr.length){
			ave = ave+arr[y];
			if (max<arr[y]){
				max = arr[y];
			}
			if (min>arr[y]){
				min = arr[y];
			}
			y = y+1;
		} ave = ave/arr.length;
		
		
		
		System.out.println("There are " + arr.length + " elements.");
		System.out.println("The maximum is: " + max);
		System.out.println("The minimum is: " + min);
		System.out.println("The average is: " + ave);
		
	}
}
