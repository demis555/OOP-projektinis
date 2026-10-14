import Character.Player;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CharacterCreation menu =
                new CharacterCreation(scanner);

        Player player = menu.createPlayer();

        System.out.println("\nWelcome, " + player.getName() + "!");
        System.out.println("Health: " + player.getHealth());
        System.out.println("Attack: " + player.getAttack());
        System.out.println("Defense: " + player.getDefense());
        System.out.println("Evasion: " + player.getEvasion());

        scanner.close();
    }
}