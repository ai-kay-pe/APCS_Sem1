/*
 *	Author:  
 *  Date: 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		/*
			Create a program that creates a crossword puzzle hiding 1 word given by the user!

			1. Take a word from the user
			2. Create a 2D String array with a size of 5 larger than the word size in both directions
			3. Choose what direction the word should hide in
				- Vertical, Horizontal, Diagonal
				- EXTRA: Choose if the word should hide forward or backwards
			4. For each letter in the word, hide it into a spot in the 2D array
				- This spot should be chosen randomly within the bounds of the 2D array
			5. Once the word is stored in the array, fill up the rest of the array
				- Note what value is stored in the String array and replacing non-filled values with random letters
				- Given the letters array, choose a random letter to populate it with
			6. Print out the crossword puzzle!
			7. Ask a friend to find the word!
		*/

		String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };
        
        System.out.println("heyaaa make a word or sojehting pkeaaseeee:");
        String word = sc.nextLine().toLowerCase();
        System.out.println("\n\n");
        System.out.println("here.");

        String[][] cw = new String[word.length()+5][word.length()+5];
        
        for(int r = 0; r<cw.length; r++){
        	for(int c = 0; c<cw[0].length; c++){
        		cw[r][c] = letters[(int)(Math.random()*26)];
        	}
        }
        
        int a = (int)(Math.random()*3);
        
        if(a==0){ //hori
        	int l = (int)(Math.random()*word.length()+5);
        	int p = (int)(Math.random()*6);
        	for(int i = 0; i<word.length(); i++)
        		cw[l][p+i] = word.substring(i,i+1);
        }
        
        if(a==1){ //vert
        	int l = (int)(Math.random()*6);
        	int p = (int)(Math.random()*word.length()+5);
        	for(int i = 0; i<word.length(); i++)
        		cw[l+i][p] = word.substring(i,i+1);
        }
        
        if(a==2){
        	int l = (int)(Math.random()*6);
        	int p = (int)(Math.random()*6);
        	for(int i = 0; i<word.length(); i++)
        		cw[l+i][p+i] = word.substring(i,i+1);
        }
        
        for(int r = 0; r<cw.length; r++){
        	for (int c = 0; c<cw[0].length; c++){
        		System.out.print(cw[r][c]+" ");
        	}
        	System.out.println();
        }
		
		
		
		
		
		
		
	}
}
