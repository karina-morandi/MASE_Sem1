package innerclasses;

interface R {}  
interface S { 
    void b();			// public by default
}

// The goal is here to get X and Y to be treated as an R and an S.
class X implements R, S {
    @Override
    public void b() {}	// must be public
}

class Y implements R {

    S makeB() {
        // class Y$1 implements S{
        //    public void b(){}
        // }
        // return new Y$1();
        return new S() {
            @Override
            public void b() {}
        };
    }
}

public class InterfaceExample {

    static void takesR(R r) {}

    static void takesS(S s) {}

    public static void main(String[] args) {
        X x = new X();
        takesR(x);
        takesS(x);

        Y y = new Y();
        takesR(y);
        takesS(y.makeB());

        //new B();
    }

}