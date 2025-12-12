public class monster {
    private String name;
    private int health;
    private int damage;

    public monster(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
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
