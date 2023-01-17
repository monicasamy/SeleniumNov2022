package week3.day2;

import java.util.HashMap;
import java.util.Map;
public class MostDuplicate {

	public static void main(String[] args) {
		
		String input = "abbaba";
		char[] ca = input.toCharArray();
		int value = 0;
		char key = input.charAt(0);
		Map<Character,Integer> dup = new HashMap<Character,Integer>();
		for(int i =0;i<ca.length;i++)
		{
		  dup.put(ca[i], dup.getOrDefault(ca[i], 0)+1);// instead of if loop to find occ
		  if(dup.get(ca[i])>value)
		  {
			value =  dup.get(ca[i]);
			key = ca[i];
		  }
		}
		System.out.println(dup);
		System.out.println("First most duplicated char is " + " " + key);
		
	}

}
