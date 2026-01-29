/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	private String own;
	private int acn;
	private double cash;
	private boolean isa;
	private String isaword;
	private int nextAccountNumber = (int)(Math.random()*(1000-50)+50);
	// -------CONSTRUCTORS-------
	public BankAccount(){
		own = "Unknown";
		acn = nextAccountNumber+1;
		cash = 0;
		isa = true;
		isaword = "Active";
	}
	public BankAccount(String o){
		own = o;
		acn = nextAccountNumber+1;
		cash = 0;
		isa = true;
		isaword = "Active";
	}
	public BankAccount(String o, double c){
		own = o;
		acn = nextAccountNumber+1;
		cash = c;
		isa = true;
		isaword = "Active";
	}
	
	

	// -------METHODS-------
	public void checkBalance(){
		System.out.println("\nHeres your balance:\n" + cash);
	}
	public void displayAccountInfo(){
		System.out.println("Heres your account information:\nOwner: " + own +"\nAccount Number "+ acn+"\nBalance: $"+cash+"\nStatus: "+isaword);
	}

}