/*
    public interface Contents {
        int value();
    }
 */
package InnerClasses;

// After you compile this file, the following classes are created in the following file structure:
//     .../innerclasses/Parcel6.class
//     .../innerclasses/Parcel6$1.class (this is the anonymous inner class)

public class Parcel6 {  // p373
    public Contents getContents() {
        // The anon inner class syntax is shorthand for:
        //      class Parcel6$1 implements Contents{
        //         private int i = 11;
        //         public int value() { return i; }
        //      }
        //      return new Parcel6$1();
        return new Contents() {
            private int i = 11;
            @Override
            public int value() { return i; }
        }; 
    }
    public static void main(String[] args) {
        Parcel6 p  = new Parcel6();
        Contents c = p.getContents();
        System.out.println(c.value());  // "11"
    }
}
