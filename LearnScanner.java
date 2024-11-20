package New;

import java.util.Scanner;

public class LearnScanner {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Username : ");
		String name = input.nextLine();
		System.out.println("My name is :" + name);
		
		
		System.out.print("Enter your pin : ");
		int pin = input.nextInt();
		System.out.println("My pin is :" + pin);
		
		

		System.out.print("Enter your name : ");
		String value = input.next();
		System.out.println("My name is :" + value);
	

	}

}
