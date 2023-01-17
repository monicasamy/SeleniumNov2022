package week3.day2;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;


public class FindNumbersOccurances {

	public static void main(String[] args) {
		
		int[] array = {2,3,5,6,3,2,1,4,2,1,6,-1};
		Arrays.sort(array);
        Map<Integer,Integer> occ = new TreeMap<Integer,Integer>();
        for(int i=0;i<array.length;i++)
        {
        	if(occ.containsKey(array[i]))
        			{
        		          int value = occ.get(array[i]);// returns the value for the key
        		          occ.put(array[i], value+1);
        			}else
        			{
        				occ.put(array[i], 1);
        			}
        }
       System.out.println(occ);
 
	}

}
