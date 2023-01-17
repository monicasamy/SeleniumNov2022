package week3.day2;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		//Collections - set
		
		int[] runningno = {2,4,6,1,3,5,8,9,10};
		Set<Integer> asc = new TreeSet<Integer>();
		for(int s:runningno)
		{
			asc.add(s);
		}
		System.out.println(asc);
		//empty array
		Integer[] array = new Integer[asc.size()];
		//converting set to array
		asc.toArray(array);
		for(int i=0;i<array.length-2;i++)
		{
			int a = array[i+1];
			int b = array[i]+1;
			if(a!=b)
			{
				System.out.println("The missing number is"+ " " + (a-1));
				
			}
			
		}
		
	}

}
