package Character;

public abstract class Player extends GameCharacter {

    protected Player(String name, int maxHealth, int attack, int defense, int evasion) {
        super(name, maxHealth, attack, defense, evasion);
    }
}