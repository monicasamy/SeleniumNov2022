package week1.day2;

public class Primenumber {

	public static void main(String[] args) {
		int k = 7;
		int count = 0;
		for(int i = 1;i<=k;i++)
{
	if(i%1==0)
	{
		count++;
	}
}
		if(count==2)
		{
		System.out.println(k+" "+"is a prime number");	
		}else
		{
			System.out.println(k+" "+"is not a prime number");
		}
}

	}
