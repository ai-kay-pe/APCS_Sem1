/* 
    Lecture note example - Methods
*/
import java.util.Scanner;

class LectureMethod{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("#1 ");
        int num1 = sc.nextInt();
        System.out.print("#2 ");
        int num2 = sc.nextInt();
        
        System.out.println(squared(num1));
        int num1Squared = squared(num1);
        System.out.println(num1Squared);
        
        System.out.println(abs(num2));
        int num2Absolute = abs(num2);
        System.out.println(num2Absolute);
	}
	
	public static int squared(int a){
	    int ans = a * a;
	    return ans;
	}
	public static int abs(int a){
	    if(a<0){
	        return a*-1;
	    }
	    else
	    return a;
	}
}