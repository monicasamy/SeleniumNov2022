package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		//Collections - set
		String name = "Monica Ramasamy";
		char[] c = name.toCharArray();
		Set<Character> newc = new LinkedHashSet<Character>();
		for(char s:c)
		{
			newc.add(s);
		}
		System.out.println(newc);
	}

}
