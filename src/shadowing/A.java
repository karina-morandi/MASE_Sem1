package shadowing;

public class A {
	public int i=10;
    private int j=20;
    int m=1;
    
    public void im(){
    	System.out.println("A::im()");
    }
    public static void sm(){
    	System.out.println("A::sm()");
    }
}