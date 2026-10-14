package Character;
public abstract class GameCharacter {

    private final String name;
    private int health;
    private int maxHealth;
    private int attack;
    private int defense;
    private int evasion;

    public GameCharacter(String name, int maxHealth, int attack, int defense, int evasion) {
        this.name = name;
        this.health = maxHealth;
        this.maxHealth = maxHealth;
        this.attack = attack;
        this.defense = defense;
        this.evasion = evasion;
    }

    public void takeDamage(int damage) {
        if (damage < 0) {
            throw new IllegalArgumentException("Damage cannot be negative.");
        }

        health -= damage;

        if (health < 0) {
            health = 0;
        }
    }

    public void heal(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Healing cannot be negative.");
        }

        health += amount;

        if (health > maxHealth) {
            health = maxHealth;
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getEvasion() { return evasion;}
}