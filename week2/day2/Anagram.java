package week2.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		if(text1.length()==text2.length())
		{
			System.out.println("The length of both the texts are same");
		}else
		{
			System.out.println("Not equal");
		}
		char[] c1 = text1.toCharArray();
		char[] c2 = text2.toCharArray();
		System.out.println("Characters in text1");
		for (char ch1: c1){   
			System.out.println(ch1);
		    }
		System.out.println("Characters in text2");
		for (char ch2: c2){
		       System.out.println(ch2);
		    }
		Arrays.sort(c1);
		System.out.println("Characters in text1 after sort");
		for (char c: c1){
		       System.out.println(c);
		    }
		Arrays.sort(c2);
		System.out.println("Characters in text2 after sort");
		for (char ch: c2){
		       System.out.println(ch);
		    }
		boolean result = Arrays.equals(c1, c2);
		if(result==true)
		{
			System.out.println("Both the arrays are same");
		}else
		{
			System.out.println("They are different");
		}
	

}
}
