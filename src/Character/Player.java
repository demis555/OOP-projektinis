package Character;

public abstract class Player extends GameCharacter {

    protected Player(String name, int maxHealth, int attack, int defense) {
        super(name, maxHealth, attack, defense);
    }
}