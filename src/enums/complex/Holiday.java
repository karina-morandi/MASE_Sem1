package enums.complex;

public class Holiday {

	public static void goSomewhere(Direction d) {
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		goSomewhere(Direction.NORTH);
		
		goSomewhere(Direction.EAST);
		
		// We could use this if we import the enum: import static packageName.enumName
		//goSomewhere(EAST);
		
		//We CANNOT use new with enums
		Direction south = Direction.SOUTH;
		goSomewhere(south);
	}

}
