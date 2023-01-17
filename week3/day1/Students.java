package week3.day1;

public class Students {
 //method overloading
	
	void getStudentInfo(int id) {
		System.out.println(id);

	}
	void getStudentInfo(int id, String name)
	{
		System.out.println("ID = "+ " " + id);
		System.out.println("Name = "+ " "+ name);
	}
	void getStudentInfo(String email,long phonenum)
	{
		System.out.println("Mail ID = "+ " "+ email);
		System.out.println("Phone num =" + " "+ phonenum);
	}
	
	public static void main(String[] args) {
		Students s = new Students();
		s.getStudentInfo(14);
		s.getStudentInfo(14, "Monica");
		s.getStudentInfo("monipsgct@gmail.com", 9659170775L);

	}

}
