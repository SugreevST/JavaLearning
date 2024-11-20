package New;

public class CalcCombo2 {
	 public  void  addition2(){
	        int x = 10;
	        int y = 10;
	        int sum = 0;
	        sum = x+y;
	        System.out.println("sum = "+ sum);
	    }
	    public  void  subraction2(){
	        int x = 30;
	        int y = 10;
	        int sub  = 0;
	        sub = x-y;
	        System.out.println("sub ="+ sub);
	    }
	    public  static void multiplication2() {
	       int x = 20;
	        int y = 10;
	        int multiplication = 0;
	        multiplication = x*y;
	        System.out.println("multiplication=" + multiplication);
	    }
	    public static void divison2(){
	        float x =10;
	        float y = 28;
	        float div = 0;
	        div = x/y;
	        System.out.println("Division =" + div);
	    }

	   public static void main(String []args) {
		CalcCombo1 obj3 = new CalcCombo1();
		CalcCombo2 obj4 = new CalcCombo2();
		CalcCombo1.addition1();
		obj4.addition2();
		CalcCombo1.subraction1();
		obj4.subraction2();
		obj3.multiplication1();
		multiplication2();
		obj3.divison1();
		divison2();
		 
		
		
		   
	   }

}
