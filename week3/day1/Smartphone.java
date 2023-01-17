package week3.day1;

public class Smartphone extends Androidphone {
	
	public void connectWhatsApp() {
		System.out.println("Whatsapp connected");
	}
	public void takeVideo()
	{
		System.out.println("I took the video from smartphone");
	}

	public static void main(String[] args) {
		
		Smartphone myMob = new Smartphone();
		myMob.connectWhatsApp();
		myMob.sendMsg();
		myMob.makeCall();
		myMob.saveContact();
		myMob.takeVideo();
		
	}

}
