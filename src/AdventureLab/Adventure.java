package AdventureLab;

// Multiple interfaces.

public class Adventure {
    public static void someFight(CanFight x) { x.fight(); }
    public static void someSwim(CanSwim x) { x.swim(); }
    public static void someFly(CanFly x) { x.fly(); }
    public static void someAction(ActionCharacter x) { x.fight(); }
    
    public static void main(String[] args) {
        Hero h = new Hero();
        someFight(h);   // Treat it as a CanFight           - "ActionCharacter::fight()"
        someSwim(h);    // Treat it as a CanSwim            - "Hero::swim()"
        someFly(h);     // Treat it as a CanFly             - "Hero::fly()"
        someAction(h);  // Treat it as an ActionCharacter   - "ActionCharacter::fight()"
  }
} 