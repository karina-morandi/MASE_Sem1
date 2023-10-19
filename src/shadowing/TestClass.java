package shadowing;

public class TestClass {
    public static void main(String []args){     
    	// a.
        C c = new C();
        // b.
//        System.out.println(c.i);	// B.i is not visible
        // c.
//        System.out.println(c.j);	// A.j is not visible
        // d.
//        System.out.println(c.k); //40
        // e.
//        System.out.println(((A)c).i);// 10
        // f.
//        System.out.println(c.m);// 3
        // g.
//        System.out.println((B)c.m);
        // h.
//        System.out.println(((B)c).m);// 2
        // i.
//        System.out.println(((A)c).m); // 1
   
        // j.
        A a = new C();
        a.im();     // C::im()

        // k.
        a=new B();
        a.im();     // B::im()

        // l.
        a=new A();
        a.im();     // A::im()
        
        // m.
        a=new C();
        ((A)a).im();    // C::im()
        
        // n.
        A aref = new C();
        System.out.println(aref.m); // 1
        aref.im();   	// C::im()			
        aref.sm();      // A::sm()
    }
}
