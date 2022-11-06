package week1.day1;

public class TwoWheeler {

	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 23456789789456123L;
	boolean isPunctured = false;
	String bikeName = "Vespa";
	double runningKM = 5000.45;
	
	
	public static void main(String[] args) {
	
		TwoWheeler myBike = new TwoWheeler();
		System.out.println(myBike.noOfWheels);
		System.out.println(myBike.noOfMirrors);
		System.out.println(myBike.chassisNumber);
		System.out.println(myBike.isPunctured);
		System.out.println(myBike.bikeName);
		System.out.println(myBike.runningKM);

	}

}
