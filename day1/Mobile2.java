package week1.day1;

public class Mobile2 {
	
	String mobileBrandName = "Oneplus";
	char mobileLogo = '1';
	short noOfMobilePiece = 1;
	int modelNumber = 10;
	long mobileImeiNumber = 123456789012345L;
	float mobilePrice = 35000.5010f;
	boolean isDamaged = false;

	public static void main(String[] args) {
		
		Mobile2 myMob = new Mobile2();
		System.out.println(myMob.mobileBrandName);
		System.out.println(myMob.mobileLogo);
		System.out.println(myMob.noOfMobilePiece);
		System.out.println(myMob.modelNumber);
		System.out.println(myMob.mobileImeiNumber);
		System.out.println(myMob.mobilePrice);
		System.out.println(myMob.isDamaged);

	}

}
