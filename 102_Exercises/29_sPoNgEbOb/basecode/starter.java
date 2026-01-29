/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Alr bro say summin bru:");
		String word = sc.nextLine().toLowerCase();
		
		String wOrD = "";
		int oddeven = 0;
		
		for(int i=0; i<word.length();i++){
			if(word.substring(i,i+1).equals(" ")){
				wOrD+= " ";
				oddeven = 0;
		}
			else{
				if(oddeven%2==0){
					wOrD+=word.substring(i,i+1).toLowerCase();
					oddeven++;
				}
				else{
					wOrD+=word.substring(i,i+1).toUpperCase();
					oddeven++;
				}
			}
		}
		System.out.println("here bro:");
		System.out.println(wOrD);
	}
}
