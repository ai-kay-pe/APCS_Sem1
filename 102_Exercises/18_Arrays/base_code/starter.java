/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int[] threes = new int[1000];
		 threes[0] = 3;
		 int[] ones = new int[1000];
		 ones[0] = 1000;
		 
		 int x = 0;
		 
		 while(x<threes.length){
			System.out.print(threes[x] + " ");
			x = x+1;
			if(x == threes.length)
			break;
			else
			threes[x] = threes[x-1]+3;
		 }
		 System.out.println("-------------------------------------------------");
		 
		 int y = 0;
		 
		 while(y<ones.length){
		 	System.out.print(ones[y] + " ");
		 	y = y+1;
		 	if(y == ones.length)
		 	break;
		 	else
		 	ones[y] = ones[y-1]-1;
		 }
	}
}
