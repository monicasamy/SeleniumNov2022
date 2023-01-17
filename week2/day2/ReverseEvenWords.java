package week2.day2;

import java.util.Arrays;

public class ReverseEvenWords {
//incomplete
	public static void main(String[] args) {
		
		String test = "I am a software tester"; 
		int m = 0;
		String[] words = test.split(" ");
		String[] even = new String[2];
		for(int i=0;i<=words.length-1;i++)
		{	 
				 for(int j=0;j<=even.length-1;j++)
				 {
					 m = (i)%2;
					 if(m!=0) {
						 even[j] =words[i];	
					     System.out.println(even[j]); 
					 }	
					 
		}
		}
		String init = Arrays.toString(words);
		System.out.println(init);
		String word2 = Arrays.toString(even);
		System.out.println(word2);
		
}
}

