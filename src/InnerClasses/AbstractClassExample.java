package InnerClasses;

class C {
}

abstract class D {

    abstract void d();
}

class Z extends C {

    D makeD() {
        // class Z$1 extends D{
        //    void d(){}
        // }
        // return new Z$1();		
        return new D() {
            @Override
            void d() {}
        };
    }
}

public class AbstractClassExample {

    static void takesC(C c) {
    }

    static void takesD(D d) {
    }

    public static void main(String[] args) {

        Z z = new Z();
        takesC(z);
        takesD(z.makeD());

        //new B();
    }

}
