package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		//Collections - List and set
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> newdata = new TreeSet<Integer>();
		for(int i=0;i<=data.length-1;i++)
		{
			newdata.add(data[i]);
		}
		System.out.println(newdata);
		List<Integer> data1 = new ArrayList<Integer>(newdata);
		System.out.println(data1);
		Integer secondlargest = data1.get(data1.size()-2);
		System.out.println(secondlargest);
		
		

	}

}
