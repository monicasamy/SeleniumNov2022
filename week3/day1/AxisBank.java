package week3.day1;

public class AxisBank extends BankInfo {
	//method over riding
	void deposit() {
		System.out.println("Rs.30,000");

	}

	public static void main(String[] args) {
		AxisBank a1 = new AxisBank();
		a1.saving();
		a1.Fixed();
		a1.deposit();
		
	}

}
