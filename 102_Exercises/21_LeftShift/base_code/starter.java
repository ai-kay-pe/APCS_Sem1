/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		String[] tvChars = {
			"Walter White", "Jesse Pinkman", "Saul Goodman", "Rick Grimes",
			"Eleven", "Michael Scott", "Dwight Schrute", "Jim Halpert",
			"Leslie Knope", "Ron Swanson", "Ted Lasso", "BoJack Horseman",
			"Homer Simpson", "Bart Simpson", "Peter Griffin", "Stewie Griffin",
			"Sheldon Cooper", "Geralt (Netflix)", "Wednesday Addams", "Joe Goldberg"
		};

		System.out.println("---------------------------------------------");
		printArray(tvChars);
		System.out.println("---------------------------------------------");
		leftShift(tvChars);
		printArray(tvChars);
		System.out.println("---------------------------------------------");

		
		printArray(tvChars);
		System.out.println("---------------------------------------------");
		leftShift(tvChars, 5);
		printArray(tvChars);
		System.out.println("---------------------------------------------");
		
	}

	public static void printArray(String[] arr){
		for(int x = 0; x<arr.length; x++)
			if (x==arr.length-1){
				System.out.print(arr[x]);
				break;
			}
			else 
			System.out.print(arr[x] + ", ");
	}

	public static void leftShift(String [] arr){
		String a = arr[arr.length-1];
		arr[arr.length-1] = arr[0];
		for(int x = 0; x<arr.length-1; x++){
			arr[x] = arr[x+1];
		}
		arr[arr.length-2] = a;
	}

	public static void leftShift(String [] arr, int num){
		for(int i = 0; i<num; i++){
		String a = arr[arr.length-1];
		arr[arr.length-1] = arr[0];
		for(int x = 0; x<arr.length-1; x++){
			arr[x] = arr[x+1];
		}
		arr[arr.length-2] = a;
		}
	}
}
