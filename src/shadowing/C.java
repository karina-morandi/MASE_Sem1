package shadowing;

class C extends B{
    int m=3;
    @Override
    public void im(){
    	System.out.println("C::im()");
    }
    public static void sm(){
    	System.out.println("C::sm()");
    	}
}
