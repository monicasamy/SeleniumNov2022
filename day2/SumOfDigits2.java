package week1.day2;

public class SumOfDigits2 {

	public static void main(String[] args) {
		int m = 345, n, sum = 0;
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Sum of Digits:"+sum);
    }

}
