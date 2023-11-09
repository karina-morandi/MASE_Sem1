package enums.complex;

public enum Direction {
	//The constructor calls (instances)
	//The instances come first
	NORTH("in a northerly direction"),
	SOUTH("in a southly direction"),
	EAST("in an easterly direction"),
	WEST("in a westerly direction");
	
	//Declaring the variable comes later
	String direction;
	
	//Constructor
	private Direction(String direction) {
		this.direction = direction;
	}
	
	 @Override
	    public String toString() {
	        return "We are traveling " + direction;
	    }
}
