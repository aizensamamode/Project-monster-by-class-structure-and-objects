public class player {
     private int health;
     private int damage;

     public player(int health, int damage) {
          this.health = health;
          this.damage = damage;
     }

     public int getHealth() {
          return health;
     }

     public int getDamage() {
          return damage;
     }

     public void takeDamage(int amount) {
          this.health -= amount;
     }

     public boolean isAlive() {
          return this.health > 0;
     }

}
