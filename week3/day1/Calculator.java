package week3.day1;

public class Calculator {

	   public void add(int a, int b , int c)
	   {
		   System.out.println(a+b+c);
	   }
	   public void add(int a , int b)
	   {
		   System.out.println(a+b);
	   }
	   public void sub(double a, double b) {
		System.out.println(a-b);
	    }
	   public void sub(int a, int b) {
			System.out.println(a-b);
		}
	   public void mul(int a , double b) {	   
		   System.out.println(a*b);
	   }
       public void mul(double a, double b) {	   
		System.out.println(a*b);   
	   }
	
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.add(7, 7);
		cal.add(7, 7, 7);
		cal.sub(10.10, 5.53);
		cal.sub(5, 3);
		cal.mul(30, 2.5);
		cal.mul(2.3, 4.5);
		
	}

}
