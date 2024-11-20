package New;

public class Ccexcercisemain {
	
	public static void addition() {
		int x = 10;
		int y = 20;
		int sum2 = x+y;
		System.out.println(sum2);
		
	}
	
	public  void subraction() {
		int x = 10;
		int y = 20;
		int sub2 = x-y;
		System.out.println(sub2);
		
	}

	public static void main(String[] args) {
		
		CcExcercise1  obj1 = new CcExcercise1();
		
		Ccexcercise2 obj2 = new Ccexcercise2();
		
		Ccexcercisemain obj3 = new Ccexcercisemain();
		
		CcExcercise1.addition1();
		obj1.subraction1();
		obj1.multiplication1();
		obj1.division1();
		
		obj2.addition2();
		obj2.subraction2();
		Ccexcercise2.multiplication2();
		Ccexcercise2.division2();
		
		addition();
		obj3.subraction();
		
		

	}

}
