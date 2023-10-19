package inheritance;

public class Cartoon extends Drawing {

    public Cartoon() {
    	super();
    	
        System.out.println("Cartoon constructor");
    } // end of Constructor

    @Override
    public void sketch() {
        System.out.println("Cartoon::sketch()");
    }

    public void tomAndJerry() {
        System.out.println("Cartoon::tomAndJerry()");
    }

    public static void main(String[] args) {
        // i.
        Cartoon c = new Cartoon();	// Art constructor, Drawing constructor, Cartoon constructor
        // ii.
        c.sketchIt(new Art());		// Art constructor,Art::sketch()
        // iii.
        c.sketchIt(new Drawing());	// Art constructor,Drawing constructor,Drawing::sketch()
        // iv.
        c.sketchIt(new Cartoon());	// Art constructor,Drawing constructor,Cartoon constructor,Cartoon::sketch(),Cartoon::tomAndJerry()
        // v.
        upcasting();
//        // vi.
        downcasting();		
    }

    public void sketchIt(Art a) {
        a.sketch();
        // i.
        // a.tomAndJerry();		// error - Art has no "tomAndJerry()"
        if (a instanceof Cartoon) {
        // now it is safe to downcast to Cartoon
    	//Cartoon a1 = ((Cartoon) a);
    	//a1.tomAndJerry();
        	((Cartoon) a).tomAndJerry();
        } // close if
    } // end of sketchIt

    public static void upcasting() {
        // upcasting (implicitly done)
        // a reference of type X can refer to an object of type X or any subtype of X

        // i.
        Art a1 = new Art();			//	Art constructor
        System.out.println(a1);		//	Art::toString()

        // ii.
        Art a2 = new Drawing();		//	Art constructor, Drawing constructor
        System.out.println(a2);		//	Drawing::toString()

        // iii.
        Art a3 = new Cartoon();		//	Art constructor, Drawing constructor, Cartoon constructor
        System.out.println(a3);		//	Drawing::toString()

        // iv.
        Drawing d1 = new Drawing();	//	Art constructor, Drawing constructor
        System.out.println(d1);		//	Drawing::toString()

        // v.
        Drawing d2 = new Cartoon();	//	Art constructor, Drawing constructor, Cartoon constructor
        System.out.println(d2);		//	Drawing::toString()

        // vi.
        Cartoon c1 = new Cartoon();	//	Art constructor, Drawing constructor, Cartoon constructor
        System.out.println(c1);		//	Drawing::toString()
    }

    public static void downcasting() {
        // downcasting (explicitly done)

        // SAFE DOWNCASTS ==================================================================== 
        // i. Art reference - pointing to a Drawing object
        Art a1 = new Drawing();		// Art constructor, Drawing constructor
        // i.1 - A Drawing reference can point to a Drawing object
        Drawing d1 = (Drawing) a1;	// a d1 reference (of type Drawing) can refer to a Drawing object
        // i.2
        System.out.println(d1);		// Drawing::toString()

        // ii. Art reference - pointing to a Cartoon object
        Art a2 = new Cartoon();		// Art constructor, Drawing constructor, Cartoon constructor
        // ii.1 - A Drawing reference can point to a Cartoon object
        Drawing d2 = (Drawing) a2;	// a d2 reference (of type Drawing) can refer to a Cartoon object
        // ii.2
        System.out.println(d2);		// Drawing::toString()
        // ii.3 - A Cartoon reference can point to a Cartoon object
        Cartoon c1 = (Cartoon) a2;	// a c1 reference (of type Cartoon) can refer to a Cartoon object
        // ii.4
        System.out.println(c1);		// Drawing::toString()

        // iii. Drawing reference - pointing to a Cartoon object
        Drawing d3 = new Cartoon();	//	Art constructor, Drawing constructor, Cartoon constructor
        // iii.1 - A Cartoon reference can point to a Cartoon object
        Cartoon c2 = (Cartoon) d3;	// 	a c2 reference (of type Cartoon) can refer to a Cartoon object
        // iii.2
        System.out.println(c2);		//	Drawing::toString()
        // SAFE DOWNCASTS ==================================================================== 

        // ClassCastExceptions =============================================================== 
        // A ref of type X *cannot* refer to an object of a superclass (i.e. up the hierarchy)
        // iv. - A Drawing reference cannot refer to an Art object
        Drawing d4 = (Drawing) new Art();		// ClassCastException

        // v. - A Cartoon reference cannot refer to an Art object
        Cartoon c3 = (Cartoon) new Art();		// ClassCastException

        // vi. - A Cartoon reference cannot refer to an Drawing object
        Cartoon c4 = (Cartoon) new Drawing();	// ClassCastException
        // ClassCastExceptions =============================================================== 
    }

}

