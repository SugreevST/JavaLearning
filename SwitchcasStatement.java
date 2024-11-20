package New;

public class SwitchcasStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		switch(grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'c':
			System.out.println("Average");
			break;
		case 'd':
			System.out.println("Fail");
			break;	
			
		default:
			System.out.println("Default"
					+ "");
			
		}

	}
}
