package PlayersHealth;

public class Player {
    //private key prevents the access of private fields outside of Player class.
    private String name;
    private String weapons;
    private int fullHealth = 100;//fullHealth, now, cannot exceed 100.
    private int damage = (int) (Math.random() * 120);//Gives the random int value from 0 to 120.

    //Constructor
    public Player(String name, int health, String weapons) {
        this.name = name;

        if(health > 0 && health <= 100) {
            this.fullHealth = fullHealth;
        }
        this.weapons = weapons;
    }

    public int getDamage() {
        return damage;
    }

    //loseHeath() method checks whether player is alive or not.
    public String loseHealth (int damage){
        int x = this.fullHealth - damage;
        if(x <= 0){
            return "Player is knocked out.";
        }
        return "Player is still alive.";
    }
    //healthLeft() method checks how much health is left.
    public int healthLeft(int damage){
        this.fullHealth = this.fullHealth - damage;
        return this.fullHealth;
    }
}
