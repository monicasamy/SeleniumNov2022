package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int input = 8, firstNum = 0, secNum = 1;
		int sum;
		System.out.println(firstNum);
		for(int i = 1 ;i<=input ;i++)
		{
		sum = firstNum + secNum;
		firstNum = secNum;
		secNum = sum;
		System.out.println(sum);
		
		}
		
	}

}
