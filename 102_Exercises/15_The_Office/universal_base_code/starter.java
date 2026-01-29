/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		Employee nico = new Employee(7777, "Nicolas", "Rase", 3.30);
		System.out.println("Past Employees");
		michael.employeeToString();
		dwight.employeeToString();
		jim.employeeToString();
		pam.employeeToString();
		nico.employeeToString();
		
		michael.raiseSalary(-6767);
		dwight.raiseSalary(-69);
		jim.raiseSalary(-41);
		pam.raiseSalary(40000);
		nico.raiseSalary(1000000000);
		System.out.println("after a 6767% cut, Michael now makes: $"+michael.getSalary()+" and $"+michael.getAnnualSalary()+" a year");
		System.out.println("after a 69% cut, Dwight now makes: $"+dwight.getSalary()+" and $"+dwight.getAnnualSalary()+" a year");
		System.out.println("after a 41% cut, Jim now makes: $"+jim.getSalary()+" and $"+jim.getAnnualSalary()+" a year");
		System.out.println("after a 40000% raise, Pam now makes: $"+pam.getSalary()+" and $"+pam.getAnnualSalary()+" a year");
		System.out.println("after a 1000000000% raise, Nico now makes: $"+nico.getSalary()+" and $"+nico.getAnnualSalary()+" a year");
		
		
		
	}
}
