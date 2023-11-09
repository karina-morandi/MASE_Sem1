package mase.oop1.code1;

public abstract class Boat implements Machine {
	protected double thePrice;
	
	public Boat(double price) {
		thePrice = price;
	}

	public double getPrice() {
		return thePrice;
	}
	
	@Override
	public String toString () {
		return "" + thePrice;
	}
	
}

class Canoe extends Boat {
	Canoe(double price) {
		super(price);
	}
	
	@Override
	public void start() {
		System.out.print("Canoe::start()");
	}
	
	@Override
	public void stop() {
		System.out.print("Canoe::stop()");
	}
}

class Kayak extends Boat {
	Kayak(double price) {
		super(price);
	}
	
	@Override
	public void start() {
		System.out.print("Kayak::start()");
	}
	
	@Override
	public void stop() {
		System.out.print("Kayak::stop()");
	}
}

class Yacht extends Boat implements Desirable {
	Yacht(double price) {
		super(price);
	}
	
	@Override
	public void start() {
		System.out.print("Yacht::start()");
	}
	
	@Override
	public void stop() {
		System.out.print("Yacht::stop()");
	}
}
