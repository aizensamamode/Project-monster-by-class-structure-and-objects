public class player {
     // fields (stored inside each player object on the heap)
     private int health;
     private int damage;

     /*
      Constructor: runs when you call `new player(100, 7)`.
      - The JVM allocates memory for a new player object on the heap.
      - The constructor parameters (here `health` and `damage`) receive the argument values (100 and 7).
      - `this.health = health;` assigns the parameter value to the object's field.
        `this` refers to the newly created object.
      */
     public player(int health, int damage) {
          this.health = health; // store the constructor argument into the object's field
          this.damage = damage; // store damage value
     }

     // Getter: returns the current health value of this object
     public int getHealth() {
          return health;
     }

     // Getter: returns the damage value of this object
     public int getDamage() {
          return damage;
     }

     /*
      takeDamage: a method that changes the object's internal state.
      - When you call `Player.takeDamage(30)`, the JVM:
           1) pushes the argument (30) and a reference to `Player` onto the call stack,
           2) runs the method body which subtracts `amount` from the object's `health` field,
           3) returns to the caller.
      - This method has no return value (void); it produces a side effect by modifying the object.
     */
     public void takeDamage(int amount) {
          this.health -= amount; // reduce the object's health by `amount`
     }

     // isAlive returns true when health > 0
     public boolean isAlive() {
          return this.health > 0;
     }

}
