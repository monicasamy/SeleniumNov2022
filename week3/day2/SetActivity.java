package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetActivity {

	public static void main(String[] args) {
		
		String companyname = "google";
		char[] comp = companyname.toCharArray();
		Set <Character> company = new LinkedHashSet<Character> ();
		Set<Character> duplicatechars = new LinkedHashSet<Character>();
		for(char i = 0;i <comp.length;i++)
		{
			boolean dup = company.add(comp[i]);	
			if(dup!=true)
			{
				duplicatechars.add(comp[i]);
			}	    
		}
		System.out.println(company);	
		System.out.println(duplicatechars);

	}

}
