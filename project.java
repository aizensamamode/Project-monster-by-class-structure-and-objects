import java.util.Scanner;
// ive updated check if it works

public class project {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            // create enemy using constructor
            //create monster
            monster GOBLIN = new monster("goblin warrior", 30, 5);

            // player and starting prompt
            //set up player and starting class methods
            starting startpoint = new starting();
            player Player = new player(100, 7);
             
            //starting prompt from starting class
            startpoint.start();
            String answer_starting = scan.nextLine().trim();
            if (answer_starting.equalsIgnoreCase("y")) {
                startpoint.ifyes();
            } else { 
                startpoint.ifno();
                return;
            }

            String player_name = scan.nextLine().trim();
            System.out.println("Hello " + player_name + "!");
            System.out.println("Player HP: " + Player.getHealth() + "  Damage: " + Player.getDamage());

            System.out.println("You are walking...\n");
            System.out.println("You encounter a " + GOBLIN.getName());

            // Simple battle loop
            while (Player.isAlive() && GOBLIN.isAlive()) {
                System.out.println("\nType 'attack' to attack or 'run' to flee:");
                String encounter = scan.nextLine().trim();

                if (encounter.equalsIgnoreCase("run")) {
                    System.out.println("You ran away!");
                    break;
                }

                if (!encounter.equalsIgnoreCase("attack")) {
                    System.out.println("Please type 'attack' or 'run'.");
                    continue;
                }

                // player attacks
                GOBLIN.takeDamage(Player.getDamage());
                System.out.println("You attack the goblin. Goblin HP: " + GOBLIN.getHealth());

                if (!GOBLIN.isAlive()) {
                    System.out.println("The goblin is defeated!");
                    break;
                }

                // goblin attacks
                Player.takeDamage(GOBLIN.getDamage());
                System.out.println("Goblin attacks you. Your HP: " + Player.getHealth());

                if (!Player.isAlive()) {
                    System.out.println("You have been defeated...");
                    System.out.println("Game Over.");
                    break;
                }
            }
        }
    }

}
