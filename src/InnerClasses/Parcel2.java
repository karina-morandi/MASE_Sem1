package innerclasses;

// Returning a reference to an inner class.
// After you compile this file, the following classes are created in the following file structure:
//     .../innerclasses/Parcel2.class
//     .../innerclasses/Parcel2$Contents.class
//     .../innerclasses/Parcel2$Destination.class
public class Parcel2 {
    // instance and class variables for Parcel2 go here
    
    class Contents {

        private int i = 11; // instance variable for Contents

        public int value() {
            return i;
        }
    }

    class Destination {

        private String label;// instance variable for Destination

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents cont() {// instance (non-static) method
        return new Contents();
    }

    public void ship(String dest) {// instance (non-static) method
        Contents c      = cont();
        Destination d   = to(dest);
        System.out.println(d.readLabel());      // "Tanzania"
    }

    public static void main(String[] args) {// class (static) method
        Parcel2 p = new Parcel2();
        p.ship("Tanzania");

        Parcel2 q = new Parcel2();
        // Defining references to inner classes:
        Parcel2.Contents c = q.cont(); // ref required to call instance method
        Parcel2.Destination d = q.to("Borneo");
        System.out.println(d.readLabel());      // "Borneo"
    }
}
