package mase.oop1.code1;

public abstract class Car implements Machine {
	protected double thePrice;
	
	public Car(double price) {
		thePrice = price;
	}
	
	public double getPrice() {
		return thePrice;
	}
	
	@Override
	public String toString() {
		return "\n\tHow Much:\t\t" + thePrice;
	}
	
	public abstract boolean isPractical();
	
}


class Saloon extends Car {
	Saloon(double price) {
		super(price);
	}
	
	@Override
	public void start() {
		System.out.print("Saloon::start()");
	}
	
	@Override
	public void stop() {
		System.out.print("Saloon::stop()");
	}
	
	@Override
	public boolean isPractical() {
		return true;
	}
}

class Hatchback extends Car {
	Hatchback(double price) {
		super(price);
	}
	
	@Override
	public void start() {
		System.out.print("Hatchback::start()");
	}
	
	@Override
	public void stop() {
		System.out.print("Hatchback::stop()");
	}
	
	@Override
	public boolean isPractical() {
		return true;
	}
}

class Convertible extends Car implements Desirable {
	Convertible(double price) {
		super(price);
	}
	
	@Override
	public void start() {
		System.out.print("Convertible::start()");
	}
	
	@Override
	public void stop() {
		System.out.print("Convertible::stop()");
	}
	
	@Override
	public boolean isPractical() {
		return false;
	}
	
}