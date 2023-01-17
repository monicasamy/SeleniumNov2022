package week2.day2;

public class FindTypes {

	public static void main(String[] args) {
		 
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] sent = test.toCharArray();
		for(int i=0;i<sent.length-1;i++)
		{
			if(sent[i]==' ')			
			{
				space = space + 1;
			}else if(sent[i]=='$')
			{
				specialChar = specialChar + 1;
			}else if(sent[i]=='2')
			{
				num = num + 1;
			}else
			{
				letter = letter + 1;
			}
		}
		System.out.println("letter = "+ " "+ letter);
		System.out.println("space = "+ " "+ space);
		System.out.println("num = "+ " "+ num);
		System.out.println("specialChar = "+ " "+ specialChar);

	}

}
