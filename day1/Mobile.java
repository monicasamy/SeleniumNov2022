package week1.day1;

public class Mobile {
	
	
	private void makeCall() {
		System.out.println("Calling the contact");

	}
	private void sendMsg() {
		System.out.println("Message sent");
	}

	public static void main(String[] args) {
		
		Mobile myMob = new Mobile();
		myMob.makeCall();
		myMob.sendMsg();

	}

}
