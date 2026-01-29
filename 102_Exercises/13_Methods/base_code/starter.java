/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	public static boolean isLeapYear(int a){// The goal of the first method is to give back whether the year given is a leap year or not. 2004 is a leap year.
		if((a%4)==0){
			return true;
		}
		else
		return false;
	}

	public static int getDigitSum(int a){// The goal of the second method is to add all the digits of a number up. Ex: 12345 has a total of 15.
		int sum1 = a%10;
		int sum2 = a%100/10;
		int sum3 = a%1000/100;
		int sum4 = a%10000/1000;
		int sum5 = a%100000/10000;
		int sumstotal = sum1+sum2+sum3+sum4+sum5;
		return sumstotal;
	}
	public static String printIfConsecutive(int a, int b, int c){// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive. It will print if they are or not.
		int x = a;												 // Assume that the first number is always the smallest and the third number is always the largest.
		int y = b;
		int z = c;
		String ans;
		if(x==y-1&&y==z-1){
			ans = "These numbers are consecutive!!!";
		}
		else{
			ans = "These numbers are not consecutive!!!";
		}
		System.out.println(ans);
		return ans;
	}
	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
	}
}
