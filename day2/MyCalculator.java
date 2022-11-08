package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		int addition = myCalc.add(5,10,15);
		int subtraction = myCalc.sub(5, 10);
		double multiplication = myCalc.mul(40.35,2.25);
		float division = myCalc.divide(40.5f,2.5f);
		System.out.println(addition);
		System.out.println(subtraction);
		System.out.println(multiplication);
		System.out.println(division);
		

	}

}
