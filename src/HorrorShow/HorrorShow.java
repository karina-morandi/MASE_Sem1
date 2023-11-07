package HorrorShow;

// Extending an interface with inheritance.

public class HorrorShow {
    public static void isMonster(Monster b) { 
        b.menace(); 
    }
    public static void isDangerousMonster(DangerousMonster dm) {
        dm.menace();
        dm.destroy();
    }
    public static void isVampire(Vampire v) { 
        v.menace();         // Monster interface
        v.destroy();        // DangerousMonster interface
        v.kill();           // Lethal interface
        v.drinkBlood();     // Vampire interface
    }
    public static void isLethal(Lethal l) {
        l.kill();           // Lethal interface
    }
    public static void main(String[] args) {
        // DragonZilla refs can be treated as DragonZilla refs (obviously) but also the refs can be 
        // upcast to (and therefore treated as) DangerousMonster and Monster references.
        DragonZilla dz = new DragonZilla();
        isMonster(dz);                      // "DragonZilla::menace()"
        isDangerousMonster(dz);             // "DragonZilla::menace()"
                                            // "DragonZilla::destroy()"
        
        // The remainder is creating a Dracula object and passing it into various methods;
        // these methods upcast the Dracula reference to all the interfaces that the 
        // Dracula class implements (either directly or indirectly)...
        Dracula dracula = new Dracula();
        isMonster(dracula);                 // "Dracula::menace()"
        isDangerousMonster(dracula);        // "Dracula::menace()"
                                            // "Dracula::destroy()"
        
        isVampire(dracula);                 // "Dracula::menace()"
                                            // "Dracula::destroy()"
                                            // "Dracula::kill()"
                                            // "Dracula::drinkBlood()"
        
        isLethal(dracula);                  // "Dracula::kill()"
    }
} 