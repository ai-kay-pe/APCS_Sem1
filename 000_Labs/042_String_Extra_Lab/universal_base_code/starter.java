/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		System.out.println("SaySomethingOrElseYouWillFaceConsequences:");
		String word = a.nextLine();		//the sentence to flip
		String ahhhh = "";	//variable that holds the fliped sentence
		int ian = -676767;	//finds the end of word
		String park = "";	//is the word
		while(word.indexOf(" ")!=-1){
			ian = word.indexOf(" ");
			park = word.substring(0,ian);
			ahhhh = park+" "+ahhhh;
			word = word.substring(ian+1);
		}
		System.out.print(word + " " + ahhhh);


		
	}
}
