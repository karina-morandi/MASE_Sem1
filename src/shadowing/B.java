package shadowing;

class B extends A{
    private int i=30;
    public int k=40;
    int m=2;

    @Override
    public void im(){
    	System.out.println("B::im()");
    }
    public static void sm(){
    	System.out.println("B::sm()");
    }
}
