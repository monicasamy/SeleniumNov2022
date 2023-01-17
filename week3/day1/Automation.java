package week3.day1;

//Interface
//Abstract

public class Automation extends MultipleLangauge {
	

	public static void main(String[] args) {
		Automation a = new Automation();
		a.Java();
		a.Selenium();
		a.python();
		a.ruby();
		
	}

	public void Java() {
		System.out.println("We use Selenium with Java");
		
	}

	public void Selenium() {
		System.out.println("Selenium is the test automation tool used in our project");
		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby is also an add-on");
		
	}

}
