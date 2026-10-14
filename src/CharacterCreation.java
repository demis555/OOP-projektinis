import Character.*;
import java.util.Scanner;

public class CharacterCreation {

    private final Scanner scanner;

    public CharacterCreation(Scanner scanner) {
        this.scanner = scanner;
    }

    public Player createPlayer() {

        System.out.print("Enter your character's name: ");
        String name = scanner.nextLine();

        while (true) {
            System.out.println("\nChoose your class:");
            System.out.println("1. Warrior");
            System.out.println("2. Sorcerer");
            System.out.println("3. Archer");
            System.out.println("4. Paladin");
            System.out.print("Your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    return new Warrior(name);
                case "2":
                    return new Sorcerer(name);
                case "3":
                    return new Archer(name);
                case "4":
                    return new Paladin(name);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}