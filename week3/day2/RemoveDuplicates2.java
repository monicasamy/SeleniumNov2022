package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates2 {

	public static void main(String[] args) {

		String a = "PayPal India";
		char[] c = a.toCharArray();
		Set<Character> charset = new LinkedHashSet<Character>();
		Set<Character> dupcharset = new LinkedHashSet<Character>();
		for(int i=0;i<=c.length-1;i++)
		{
			 if(charset.contains(c[i]))
				{
				  // to add duplicates			 
					dupcharset.add(c[i]);
				}else
				{
					//to remove space
					if(c[i]!= ' ')
					{
						//to add the unqiue ones
						 charset.add(c[i]);
					}				
					 
				}				
		}
		
		System.out.println(charset);
		System.out.println(dupcharset);


	}

}
