package New;

import java.util.Scanner;

public class SwapNumbers {
	public static void main (String args[]){
		
		System.out.println("Enter a number : " );
		System.out.print("before swap");
		Scanner a = new Scanner(System.in);
		int b = a.nextInt() ;
		int c = a.nextInt()	;	
		
		int temp = b;
		b = c;
		c = temp;		
		
		System.out.println(b);
		System.out.println(c);
	}

}
