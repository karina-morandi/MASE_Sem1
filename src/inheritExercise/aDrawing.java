package inheritExercise;

public class aDrawing extends aArt {
	
	// This is the constructor
	aDrawing() {
		System.out.println("aDrawing Constructor");
	}
	
//	aDrawing(){               It's not necessary to include this constructor with no args, only super() because the compiler does this automatically
//		super();
//	}
	
	@Override
	public void sketch() {
		System.out.println("aDrawing::sketch()");
	} // Overrides parent method
	
	@Override
	public String toString() {
		return "aDrawing::toString()";
	}

}
