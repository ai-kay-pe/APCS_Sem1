package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;
	
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	public Dog(String n){
		name = n;
		age = 1;
		breed = "dog dog";
	}
	public Dog(String n, String b){
		name = n;
		age = 1;
		breed = b;
	}
	public Dog(String n, int a){
		name = n;
		age = a;
		breed = "dog dog";
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setBreed(String breed){
		this.breed = breed;
	}
	
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public String getBreed(){
		return this.breed;
	}
	
	public boolean isSleeping(){
		return Math.random()*2>1;
	}
	
	public void bark(){
		System.out.println(getName() + " barks!");
	}
	
	
	
	
	
	
	
	

}
