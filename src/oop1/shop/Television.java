package oop1.shop;

public abstract class Television implements ElectronicDevice {
	private String theMake;
	private String theModel;
	
	
	Television(String aMake, String aModel) {
		theMake = aMake;
		theModel = aModel;
	}

	@Override
	public String getTheMake() {
		return theMake;
	}

	@Override
	public String getTheModel() {
		return theModel;
	}

	@Override
	public String toString() {
		return getTheMake() + " " + getTheModel();
	}
	
}

class Plasma extends Television implements HighlyDesirable {

	Plasma(String aMake, String aModel) {
		super(aMake, aModel);
	}
	
	@Override
	public void turnOn() {
		System.out.println("Plasma::turnOn");		
	}
	
	@Override
	public void turnOff() {
		System.out.println("Plasma::turnOff");
	}
}

class LED extends Television {
		
	LED(String aMake, String aModel) {
		super(aMake, aModel);
	}
	
	@Override
	public void turnOn() {
		System.out.println("LED::turnOn");		
	}
	
	@Override
	public void turnOff() {
		System.out.println("LED::turnOff");
	}
}
