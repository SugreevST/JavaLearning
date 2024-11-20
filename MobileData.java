package New;

public class MobileData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seconds = 1800;
		int minutes = 1;
		
		do {
		System.out.println("You have " + seconds + "seconds");
			
			seconds --;
			
			if(seconds%60 ==0) {
				System.out.println( "You have " + minutes + "minute");
				minutes++;
							
		}
		}while(seconds>=1);

	}

}
