package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		// sum of the cube of the digits//
		int input = 153, calculated = 0, remainder, original; 
		original = input;
		while(input>0)
		{
			remainder = input%10;
			input = input/10;
			calculated = calculated + (remainder*remainder*remainder);
		}
		if(calculated==original)
		{
			System.out.println("Yes it is an armstrong number");
		}else
		{
			System.out.println("Not an armstrong number");
		}

	}

}
