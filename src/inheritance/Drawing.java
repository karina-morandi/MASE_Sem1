package inheritance;

class Drawing extends Art {

    Drawing() {
        System.out.println("Drawing constructor");
    } // end of Constructor
//	Drawing(){
//		super();
//	}

    @Override
    public void sketch() {
        System.out.println("Drawing::sketch()");
    }

    @Override
    public String toString() {
        return "Drawing::toString()";
    }
}
