import Character.Warrior;
import Character.Mage;
import Character.Archer;

public class Main {

    public static void main(String[] args) {

        Warrior warrior = new Warrior("Warrior");
        Mage mage = new Mage("Mage");
        Archer Archer = new Archer("Archer");

        System.out.println(warrior.getName() + " - " + warrior.getHealth());
        System.out.println(mage.getName() + " - " + mage.getHealth());
        System.out.println(Archer.getName() + " - " + Archer.getHealth());
    }
}