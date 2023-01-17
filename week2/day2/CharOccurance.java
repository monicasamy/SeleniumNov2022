package week2.day2;

import java.util.HashMap;
import java.util.Map;

public class CharOccurance {

	public static void main(String[] args) {
		
		String str = "welcome to chennai";
		int count = 0;
		char[] strconv = str.toCharArray();
		//TO FIND E ALONE
		for(int i=0; i<= strconv.length-1;i++)
		{
			if(strconv[i]=='e')
			{
				count = count + 1;
			}
		}
		System.out.println("E is repeated"+ " " + count + " " + "times");
		
		//TO FIND ALL THE CHAR OCCURENCES
				Map<Character,Integer> occ = new HashMap<Character,Integer>();
				for(int i=0; i<= strconv.length-1;i++)
				{
					if(occ.containsKey(strconv[i]))
					{
					    int value = occ.get(strconv[i]); 
						occ.put(strconv[i], value+1);
					}else
					{
						occ.put(strconv[i], 1);
					}		 
				}
				System.out.println(occ);	
	}
}
