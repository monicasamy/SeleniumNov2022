package week2.day2;

public class Palindrome {

	public static void main(String[] args) {
		String value = "madam";
		String rev = "";
		for(int i = value.length()-1;i>=0;i--)
		{
			rev = rev + value.charAt(i);// concatenation
		}
		System.out.println(rev);
		if(rev.equals(value))
		{
			System.out.println("It is a palindrome");
		}else
		{
			System.out.println("It is not a palindrome");
		}
	}

}
