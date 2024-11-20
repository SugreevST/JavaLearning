package New;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number :");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		
		if(num % 2 == 0)
			System.out.println(num + " is Even");
		else 
			System.out.println(num + " is Odd");
	
	}

}
