//Demonstrate the use of encapsulation.
package PlayersHealth;
import java.util.Scanner;

public class MainPlayer {
    private static Scanner scanner = new Scanner( System.in);
    public static void main(String[] args) {
        System.out.println("Enter player's name: ");//Ask User to enter player's name.
        String name = scanner.next();//Takes the String input from the user.
        System.out.println("Select your weapon: \nKatana\tSword\tShuriken\tCrossbow");
        System.out.print("Weapon name: ");
        String weapon = scanner.next();
        System.out.println();

        Player player = new Player(name, 100,weapon );//Creating player object for player class.
        int x = player.getDamage();

        System.out.println("Name\t\tHealth\t\tWeapon");
        System.out.println(name+"\t\t"+100+"\t\t\t"+weapon);

        System.out.println("Health damaged: " + x);
        System.out.println("Health left: "+player.healthLeft(x));
        System.out.println( player.loseHealth( player.getDamage()));
    }
}
