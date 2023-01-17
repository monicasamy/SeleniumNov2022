package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	//Collection - Set	
	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] texts = text.split(" ");
		Set<String> result = new LinkedHashSet<String>();
		for(String s:texts)
		{
			result.add(s);
		}
		System.out.println(result);
		String ntext = String.join(" ", result);
		System.out.println(ntext);
	}

}
