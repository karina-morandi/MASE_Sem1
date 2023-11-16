// Based on http://stackoverflow.com/questions/7874875/access-outer-class-super-from-inner-class-in-java
// https://stackoverflow.com/questions/586363/why-is-super-super-method-not-allowed-in-java
package InnerClasses;

class OuterB  {  // extends Object

    class InnerB {  // extends Object 

        void myMethod() {
            // This will print "OuterB::toString", from the OuterB class' toString() method
            System.out.println(OuterB.this.toString());
            //System.out.println(OuterB.toString());

            // This will call Object.toString() on the OuterB class' instance
            System.out.println(OuterB.super.toString());

            // These will print "InnerB::toString()", from the InnerB class' toString() method
            System.out.println(this.toString());
            System.out.println(toString());
            System.out.println(super.toString());
        }

        @Override
        public String toString() {
            return "InnerB::toString()";
        }
    }

    @Override
    public String toString() {
        return "OuterB::toString()";
    }

    public static void main(String[] args) {
        new OuterB().new InnerB().myMethod();
    }
}
/* Output:
        OuterB::toString
        cysec.innerclasses.OuterB@3a09a47d
        InnerB::toString()
        InnerB::toString()
        cysec.innerclasses.OuterB$InnerB@6d06d69c
*/
