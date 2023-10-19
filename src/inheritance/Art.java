package inheritance;

public class Art {
	
	 Art() {
	        System.out.println("Art constructor");
	 } // end of Constructor

	 // Polymorphic instance method
	    public void sketch() {
	        System.out.println("Art::sketch()");
	    }

	    @Override
	    public String toString() {
	        return "Art::toString()";
	    }
	}

	