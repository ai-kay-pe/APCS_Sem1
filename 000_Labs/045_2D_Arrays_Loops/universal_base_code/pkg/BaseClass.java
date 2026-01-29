/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	
	
	
	public void avRow(int[][] arr, int row){
		double total = 0.0;
		for(int c = 0; c<arr[0].length; c++){
			total += arr[row][c];
		}
		System.out.println("in row " + row + ", the average is " + (total/arr[0].length));
		
	}
	
	public void printArray(int[][] arr){
		for(int r = 0; r<arr.length; r++){
			for(int c = 0; c<arr[0].length; c++){
				System.out.print(arr[r][c] + " ");
			}
			System.out.println("");
		}
	}
	
	public double av(int[][] arr){
		double total = 0;
		for(int r = 0; r<arr.length; r++){
			for(int c =0; c<arr.length; c++){
				total+=arr[r][c];
			}
		}
		return total/(arr.length*arr[0].length);
	}
}


