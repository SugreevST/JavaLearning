package New;

public class NestedifStatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 30;
		int y = 100;
		int z = 0;
		z = x+y;
		
		if(x<100 && y == 100) {
			System.out.println("x is less than 100");
			
			if(x==30) {
				System.out.println(x);
			}
			
			else {
				System.out.println("This is else 1");
			}
		}
		
		else {
			System.out.println("This is else2");
		}

	

	}
}


// We can have n number of if else as much as we met our logic or requirement.
		
