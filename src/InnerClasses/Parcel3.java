package InnerClasses;

public class Parcel3 extends A {

    private int x = 44;

    private class PContents implements Contents {

        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected class ParcelDestination implements Destination {

        private String label;

        private ParcelDestination(String whereTo) { // note: private construstor
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination dest(String s) {
        return new ParcelDestination(s);
    }

    public Contents cont() {
        return new PContents();
    }

    // "Inner" demonstrates that inner classes enable multiple implementation inheritance
    // Eckel p388-389
    class Inner extends B {

        int getPrivateDataFromOuterClass() {
            return x;
        }

        void testInheritedMethods() {
            methodFromClassB();// indirectly inherited
            methodFromClassA();// directly inherited
        }
    }
}// end of the Parcel3 class

class Test {// client

    public static void main(String[] args) {
        Parcel3 parcel = new Parcel3();

//        Parcel3.Inner inner = new Parcel3().new Inner();//ok
        Parcel3.Inner inner = parcel.new Inner();//ok

        // B::methodFromClassB()
        // A::methodFromClassA()
        inner.testInheritedMethods();
        
        System.out.println( inner.getPrivateDataFromOuterClass() );//44

        // error - Parcel3.ParcelContents i.e. the class, has private access in Parcel3
        //parcel.new ParcelContents();
        // error - Parcel3.ParcelDestination(String) i.e. the constructor, 
        // has private access in Parcel3.ParcelDestination
        //parcel.new ParcelDestination("Japan");
        
        // These next few lines show that the inner classes ParcelContents and
        // ParcelDestination are completely hidden from other classes. All we have here
        // is the interface reference type. 
        Contents contents = parcel.cont();
        Destination destination = parcel.dest("Chad");

        System.out.println(contents.value());           // 11
        System.out.println(destination.readLabel());    // Chad
    }
}
