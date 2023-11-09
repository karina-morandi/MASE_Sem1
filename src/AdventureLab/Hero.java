package AdventureLab;

// Hero gets its implementation of "fight()" from its base class ActionCharacter and this 
// is how Heor implements the CanFight interface
class Hero extends ActionCharacter
        implements CanFight, CanSwim, CanFly {

    @Override
    public void swim() {
        System.out.println("Hero::swim()");
    }

    @Override
    public void fly() {
        System.out.println("Hero::fly()");
    }
}
