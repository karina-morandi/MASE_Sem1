package inheritExercise;

public class aCartoon extends aDrawing {
	
	aCartoon() {
		super();
		
		System.out.println("aCartoon Constructor");
	}
	
	@Override
	public void sketch() {
		System.out.println("aCartoon::sketch()");
	}
	
	public void tomAndJerry() {
		System.out.println("Cartoon::tomAndJerry()");
	} // end of tomAndJerry
	
	public void sketchIt(aArt a) {
		a.sketch();
				
		if (a instanceof aCartoon) {
	        // now it is safe to downcast to Cartoon
	    	//Cartoon a1 = ((Cartoon) a);
	    	//a1.tomAndJerry();
	        	((aCartoon) a).tomAndJerry();
	        } // close if
		
		aCartoon b = new aCartoon();
		b.tomAndJerry();
			
		// aArt b = new aArt();
		// ((aCartoon) b).tomAndJerry
		
		// aCartoon b = (aCartoon) new aArt();
		// b.tomAndJerry();
		
		// aArt b = new aCartoon();
		// ((aCartoon) b).tomAndJerry();
	}
	
	 public static void upcasting() {
	        // upcasting (implicitly done)
	        // a reference of type X can refer to an object of type X or any subtype of X

	        // i.
	        aArt a1 = new aArt();			//	Art constructor
	        System.out.println(a1);		//	Art::toString()

	        // ii.
	        aArt a2 = new aDrawing();		//	Art constructor, Drawing constructor
	        System.out.println(a2);		//	Drawing::toString()

	        // iii.
	        aArt a3 = new aCartoon();		//	Art constructor, Drawing constructor, Cartoon constructor
	        System.out.println(a3);		//	Drawing::toString()

	        // iv.
	        aDrawing d1 = new aDrawing();	//	Art constructor, Drawing constructor
	        System.out.println(d1);		//	Drawing::toString()

	        // v.
	        aDrawing d2 = new aCartoon();	//	Art constructor, Drawing constructor, Cartoon constructor
	        System.out.println(d2);		//	Drawing::toString()

	        // vi.
	        aCartoon c1 = new aCartoon();	//	Art constructor, Drawing constructor, Cartoon constructor
	        System.out.println(c1);		//	Drawing::toString()
	    }

	    public static void downcasting() {
	        // downcasting (explicitly done)

	        // SAFE DOWNCASTS ==================================================================== 
	        // i. Art reference - pointing to a Drawing object
	        aArt a1 = new aDrawing();		// Art constructor, Drawing constructor
	        // i.1 - A Drawing reference can point to a Drawing object
	        aDrawing d1 = (aDrawing) a1;	// a d1 reference (of type Drawing) can refer to a Drawing object
	        // i.2
	        System.out.println(d1);		// Drawing::toString()

	        // ii. Art reference - pointing to a Cartoon object
	        aArt a2 = new aCartoon();		// Art constructor, Drawing constructor, Cartoon constructor
	        // ii.1 - A Drawing reference can point to a Cartoon object
	        aDrawing d2 = (aDrawing) a2;	// a d2 reference (of type Drawing) can refer to a Cartoon object
	        // ii.2
	        System.out.println(d2);		// Drawing::toString()
	        // ii.3 - A Cartoon reference can point to a Cartoon object
	        aCartoon c1 = (aCartoon) a2;	// a c1 reference (of type Cartoon) can refer to a Cartoon object
	        // ii.4
	        System.out.println(c1);		// Drawing::toString()

	        // iii. Drawing reference - pointing to a Cartoon object
	        aDrawing d3 = new aCartoon();	//	Art constructor, Drawing constructor, Cartoon constructor
	        // iii.1 - A Cartoon reference can point to a Cartoon object
	        aCartoon c2 = (aCartoon) d3;	// 	a c2 reference (of type Cartoon) can refer to a Cartoon object
	        // iii.2
	        System.out.println(c2);		//	Drawing::toString()
	        // SAFE DOWNCASTS ==================================================================== 

	        // ClassCastExceptions =============================================================== 
	        // A ref of type X *cannot* refer to an object of a superclass (i.e. up the hierarchy)
	        // iv. - A Drawing reference cannot refer to an Art object
	        aDrawing d4 = (aDrawing) new aArt();		// ClassCastException
	        if(d4 instanceof aArt) {
	        	((aDrawing)d4).sketch();
	        }

	        // v. - A Cartoon reference cannot refer to an Art object
	        aCartoon c3 = (aCartoon) new aArt();		// ClassCastException

	        // vi. - A Cartoon reference cannot refer to an Drawing object
	        aCartoon c4 = (aCartoon) new aDrawing();	// ClassCastException
	        // ClassCastExceptions =============================================================== 
	    }
	
	public static void main (String [] args) {
		 // i.
        aCartoon c = new aCartoon();	// Art constructor, Drawing constructor, Cartoon constructor
        // ii.
        c.sketchIt(new aArt());		// Art constructor,Art::sketch()
        // iii.
        c.sketchIt(new aDrawing());	// Art constructor,Drawing constructor,Drawing::sketch() - aArt reference point to a aDrawing object
        // iv.
        c.sketchIt(new aCartoon());	// Art constructor,Drawing constructor,Cartoon constructor,Cartoon::sketch(),Cartoon::tomAndJerry()
        // v.
        upcasting();
//        // vi.
        downcasting();	
	} // end of main

}
