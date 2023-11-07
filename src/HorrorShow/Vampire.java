package HorrorShow;

// The following syntax only works when inheriting interfaces 
//   - it will not work with normal classes. 
interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}
