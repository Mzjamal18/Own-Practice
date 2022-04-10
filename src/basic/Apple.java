package basic;

import java.util.Scanner;

public class Apple {
	
	public static void main(String[] args) {

		diplay();
		Apple Rx= new Apple();
	Rx.display();
	
	}
	
public static void diplay() {
	System.out.println("How are you");
	
	}



public void display() {
	
	System.out.println("Good boy.");
	
	
	Scanner zoo= new Scanner(System.in);
	
	System.out.println("Enter your first name");
	String fname=zoo.nextLine();
	System.out.println("My Fname is : " +fname);
	
	
	System.out.println("Enter your last name");
	String lname=zoo.nextLine();
	System.out.println("My Lname is : " +lname);
	
	
	System.out.println("Enter your age");
	String age=zoo.nextLine();
	System.out.println("My age is : " +age );
	
	
	
	
	
	
	
	
	
	
}
}
