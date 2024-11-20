package New;

public class LearnConstructor {
	public LearnConstructor(int x,int y) {
		
		int sum = 0;
		sum = x+y;
		System.out.println("The sum is"+ sum);
	}
	public void multiplication(int x) {
		int y = 20;
		int z=0;
		z=x*y;
		System.out.println("The prod is"+ z);
		
	}

	public static void main(String[] args) {
		LearnConstructor obj = new LearnConstructor(20,10);
				// TODO Auto-generated method stub
		obj.multiplication(10);

	}

}
