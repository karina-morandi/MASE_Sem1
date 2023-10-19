package inheritExercise;

public class aArt {
	
	aArt() {
		System.out.println("aArt Constructor");
	} // end of constructor
	
	public void sketch() {
		System.out.println("aArt::sketch()");
	}
	
	@Override
	public String toString() {
		return "aArt::toString()";
	}

}
