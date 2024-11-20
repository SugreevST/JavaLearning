package New;

public class Internetspeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int internet = 1024;
		
		do {
			System.out.println("Your limit is " + internet);
			
			int fiftyPercent;
			fiftyPercent = 1024/2;
			
			int ninetyPercent;
			ninetyPercent = (1024*10)/100;
			
			internet--;
			
			if(internet == fiftyPercent) {
				System.out.println("Your limit is " );
				
			}
			else if(internet == ninetyPercent){
				System.out.println("Your limit is2");
			}
			
			
		}while(internet>=1);

		
	}

}
