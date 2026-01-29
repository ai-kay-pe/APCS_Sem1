/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		String[][] words = {
			// Col 0, 1, 2, 3
			{"The", "A", "My", "Our"},					// Row 0
			{"quick", "lazy", "happy", "curious"},		// Row 1
			{"dog", "cat", "robot", "student"},			// Row 2
			{"eats", "builds", "chases", "studies"},	// Row 3
			{"pizza", "code", "homework", "dreams"}		// Row 4
		};
		
		for(int r = 0; r<words.length; r++){
			System.out.print(words[r][0]+" ");
		}
			System.out.println("");

		for(int r = 0; r<words.length; r++){
			for(int c = 0; c<words[0].length; c++){
				if(r!=0&&r<3){
					System.out.print(words[r][1]+" ");
					break;
				}
				else{
					System.out.print(words[r][2]+" ");
					break;
				}
			}
		}
		
		System.out.println("");
		
		System.out.println(words[0][3]+" "+words[1][2]+" "+words[2][3]+" "+words[3][3]+" "+words[4][2]);
		System.out.println(words[0][1]+" "+words[1][3]+" "+words[2][2]+" "+words[3][1]+" "+words[4][3]);
		System.out.println(words[0][0]+" "+words[1][0]+" "+words[2][2]+" "+words[3][3]+" "+words[4][0]);
		System.out.println(words[0][2]+" "+words[1][2]+" "+words[2][2]+" "+words[2][0]+" "+words[3][0]+" "+words[4][2]);
	}
}
